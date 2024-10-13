## LAB 2 - Securing the pfSense Firewall

### Testing the Firewall From an External Network (Windows)

1. Sign in to an external machine 
2. Launch the command prompt
3. View the _IP_ of the machine by running `ipconfig`
4. To test the _connectivity_ to the _WAN IP_ Address, run `ping 203.0.113.100`
5. To determine what _ports_ are _open_ on the WAN IP Address’s firewall, run `nmap 203.0.113.100`
6. Open Zenmap with `zenmap`
7. Type `203.0.113.100` in the **Target** box and then click **Scan**
8. Once the scan completes, click the **Ports / Hosts** tab to view open ports

### Closing Unnecessary Ports on the pfSense Firewall

1. Sign in to machine that should connect to the pfSense Firewall
2. Open a browser, such as Mozilla Firefox
3. Type `192.168.1.254` in the URL bar to connect to the firewall
4. Sign in to the firewall
5. Access the firewall **Rules**
6. View both the LAN and WAN Rules
7. Access the **NAT** section
8. Remove the unnecessary protocols
9. Test the firewall on the external machine once again

### Adding a Secure Service to the pfSense Firewall

1. Sign in to the pfSense firewall machine
2. Connect to the firewall
3. Access the **NAT** section
4. Add a NAT port forwarding rule
5. Disconnect from the firewall
6. Log off the machine
7. Sign in to the external machine and test the firewall
8. Open PuTTY to ssh into the machine
9. Enter the host's (external machine's) IP and click **Open**
10. Sign in to the machine
11. Run `ifconfig` to view the **IP** of the internal Metasploitable machine that the pfSense firewall redirects to
12. Run `id root` to view info about the root account
