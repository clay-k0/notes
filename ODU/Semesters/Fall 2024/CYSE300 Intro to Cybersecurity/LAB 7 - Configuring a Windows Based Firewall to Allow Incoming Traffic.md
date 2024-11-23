## LAB 7 - Configuring a Windows Based Firewall to Allow Incoming Traffic

### Objectives

- Set Up System Services on the Internal Network
- Configure and Test the Windows-Based Firewall
- Use Internal Services from an External Machine

| Key Term | Description                                                                                                                                                                                                                                                                                                                                                                                                           |
| -------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| FTP      | FTP stands for File Transfer Protocol. FTP, which uses port 20 and 21, can be used to upload or download files from the command line or a bowser, like Firefox.                                                                                                                                                                                                                                                       |
| HTTP     | HTTP stands for Hyper Text Transfer Protocol. HTTP, which uses port 80, and is commonly used to download files from a website using browsers like Internet Explorer.                                                                                                                                                                                                                                                  |
| nmap     | Nmap can be used in Linux, Mac, or Microsoft Windows to locate machines on a network. After Nmap is used to discover machines on a network, it can also be utilized to determine which open Transmission Control Protocol (TCP) and User Datagram Protocol (UDP) ports the machine has open. Nmap will give an indication of the operating system the remote machine is using. Nmap was used in the movie The Matrix. |
| Port     | There are 65,536 ports, numbered from 0–65,535. The first 1,024 ports, ports 0-1,023 are said to be well-known. They include ports like HTTP (port 80) and FTP (port 21).                                                                                                                                                                                                                                             |
| SSH      | Secure Shell uses port 22. SSH provides a much better option than Telnet for remote administration because traffic is encrypted. SSH is native to most Linux systems.                                                                                                                                                                                                                                                 |

### Systems Setting Up Services on the Internal Network

#### Viewing File Systems

1. Sign in to the Windows Attack machine
2. Launch Command Prompt and scan for open port using `nmap 216.1.1.1`
	- Currently, the firewall is configured to redirect incoming requests for the FTP, Telnet, SMTP, HTTP, and POP3 to the Windows 2008 machine on the internal network.
3. Sign out and sign in to the Kali Linux machine
4. Open the Terminal and run `nmap 127.0.0.1`
5. View the services that are running `netstat -tan`
6. Start the vsftpd with `service vsftpd start`
7. View the open ports using `nmap 127.0.0.1`
8. Run `apache2ctl start` to start Apache
9. View the services that are running `netstat -tan`
	- After starting Apache, the Kali system is now also listening on port 80.
10. Generate SSH keys by running `ssh-keygen`
11. Run `/etc/init.d/ssh start` to start SSH
12. View the services that are running `netstat -tan`
	- After starting SSHD, the Kali system is now also listening on port 22.
13. View the services that are running `netstat -tan`

### Configuring and Testing the Windows-Based Firewall

#### Reconfiguring the Firewall

1. Sign in to the Firewall
2. Launch the Routing and Remote Access application
3. Expand IPv4, click NAT, then right-click WAN - External and select Properties
4. Go to the Services and Ports tab, highlight FTP and click Edit, then change the Private address from `192.168.1.100` to `192.168.1.50`
5. Uncheck the Internet Mail Server (SMTP), Post-Office Protocol Version 3 (POP3), and Telnet Server boxes and then click Apply
6. Click Edit on Web Server (HTTP), change Private address from `192.168.1.100` to `192.168.1.50`
7. Put SSH for the Description of the Service, 22 for the Incoming port. For the Private address, put `192.168.1.50`. For the Outgoing port, put 22. Click OK twice.
8. Click Ok then Exit
9. Right-click on FW (local), then select All Tasks and click Restart
10. Sign back in to the Windows Attack machine
11. Open Command Prompt then scan the firewall for open ports with `nmap 216.1.1.1`
12. Sign out and sign in to the Kali Linux 2 External machine
13. Open the Terminal then run `wireshark` 
14. Click Capture then select Interfaces
15. Select the box in front of eth0 then click Start
16. Open IceWeasel and in the URL bar type http://216.1.1.1 to access the public website
17. Close Iceweasel and return to Wireshark.
18. Type http in the Filter pane then click Apply, then examine that port 80 is in use
19. Right-click on the first captured packet that has GET / HTTP/1.1 in the info column and select Follow TCP Stream
20. Ensure Apache is running, then quit Wireshark

Understanding what is happening here is critical to understanding firewalls, network security, and public and private IP addressing. From the public IP address of 216.1.1.100, you are connecting to the public IP address of the Firewall. The Firewall then is redirecting the external users to the Kali machine on the company’s internal network with the IP Address of 192.168.1.50.

### Using Internal Services from an External Machine

#### Testing the Firewall

1. Sign in to the External Kali 2 attack machine
2. Open Terminal and run `ssh 216.1.1.1`, use the password
3. Copy picture files to the FTP root by running `cp /usr/share/wallpapers/kali/contents/images/* /home/hax0r$
4. List the files within the FTP root by running `ls /home/hax0r/`
5. Copy picture files to the HTTP root using `cp /usr/share/wallpapers/kali/contents/images/* /var/www/html`
6. Sign out of this machine and sign in to the Windows 7 attack machine
7. Open Command Prompt then connect to the VSFTPD Server by running `ftp 216.1.1.1`
8. Sign in to the server then list the files using `ls`
9. Issue `bin` to switch to binary mode
10. Download the PNG file from the FTP site by running `get 1024x768.png`
11. Run `bye` to exit
12. View the downloaded PNG by running `mspaint 1024x768.png`
13. Open Firefox and type http://216.1.1.1/1280x1024.png in the URL bar to access the public website
