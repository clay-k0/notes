## LAB 3 - Implementing NAT and Allowing Remote Access

### Preface

#### Key Terms

| Term     | Description                                                                                                                                           |
| -------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| firewall | A firewall can block traffic or redirect traffic to hosts on the internal network. pfSense is an open source firewall that uses a BSD-based firewall. |
| NAT      | Network Address Translation can be used to allow internal IP addresses access to the WAN.                                                             |
| VPN      | Virtual Private Network allows you to connect to a LAN for the Internet and access resources.                                                         |
| pfSense  | an open source firewall that is widely used in the industry                                                                                           |
| `ping`   | an operating system utility that allows you to test for TCP/IP connectivity between hosts                                                             |

#### Overview

NAT, or Network Address Translation, allows many machines with private IP addresses to use a single Public IP address to connect to the Internet. 

In this lab, we'll

1. Configure NAT on a firewall running pfSense (same firewall from [[LAB 2 - Securing the pfSense Firewall]])
3. Use Wireshark to understand how NAT works
4. Use remote desktop on a network

### Understanding NAT

1. Sign into the machine (Windows in this case) and launch the command prompt
2. Test connection to external machine on WAN using `ping 175.45.176.200`
3. Launch the Wireshark protocol analyzer
4. Double-click Ethernet0
5. Minimize the window
6. Back in the command prompt, run a continuous ping using `ping 175.45.176.200 -t`
7. Stop the Wireshark capture
8. In the filter pane, find the pings by applying `ip.dst == 175.45.176.200` as the filter

> [!Info]
> NAT allows internal hosts on the LAN with private IP addresses to communicate with external hosts on the WAN with public IP addresses.

9. Quit Wireshark

### Configuring NAT

1. Verify NAT works by pinging the external machine using `ping 175.45.176.200`





