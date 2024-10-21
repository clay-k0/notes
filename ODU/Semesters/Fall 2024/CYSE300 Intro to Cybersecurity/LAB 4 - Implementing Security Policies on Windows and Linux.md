## LAB 4: Implementing Security Policies on Windows and Linux

### Securing the Windows Logon Process

1. Open command prompt
2. Open Netplwiz by running `Netplwiz.exe`
3. Check the box next to "Users must enter a user name and password to use this computer"
4. Click Ok
5. Log out and log back in
6. Run command prompt as admin
7. Launch the Group Policy Management Console using `gpedit.msc`
8. Expand Computer Configuration
9. Expand Windows Settings
10. Expand Security Settings
11. Expand Local Policies
12. Click Security Options
13. Navigate to the "Interactive logon" section (click inside the results pane and press "i")
14. Double-click "Interactive logon: Message text for users attempting to log on"
15. In the message box, type "Unauthorized use is prohibited"
16. Double-click "Interactive logon: Message title for users attempting to log on"
17. In the message box, type "Warning!"
18. Log out and log back in and notice the resulting screen shown prior to the login screen

### Audit login failures.

1. Right-click the Windows Icon and click Computer Management.
2. Expand System Tools.
3. Expand Event Viewer.
4. Expand Windows Logs.
5. Click on Security.
6. Click View and select Add/Remove Columns.
7. Scroll down and select Event Source Name.
8. Click Add then Ok.
9. Note: There may be Audit Success logs but no Audit Failure logs listed.
10. To confirm this, click the Keywords Column to sort the keywords alphabetically.
11. Select File and Exit.
12. Run Command Prompt as Admin.
13. Run `gpedit.msc`.
14. Expand Computer Configuration.
15. Expand Windows Settings.
16. Expand Security Settings.
17. Expand Local Policies.
18. Click Audit Policy, then double-click "Audit account logon events."
19. Check the box next to Failure, then click Ok.
20. Sign out of the machine.
21. Right-click the Windows Icon and click Computer Management.
22. Expand System Tools.
23. Expand Event Viewer.
24. Expand Windows Logs and click Security.
25. Repeat previous steps similarly to Add Event Source Name.
26. Click Ok, then click the Keywords column.

### Securing Linux

1. While on Windows, open Command Prompt as Admin and run `zenmap`
2. Enter the Linux Machine's IP (`192.168.1.30` in this case) in the Target box then click Scan
3. Click Ports/Hosts
4. Notice telnet Port 23 is open
5. Quit Zenmap
6. Telnet to the Linux machine by running `telnet 192.168.1.30` in the Command Prompt
7. Sign in to Metasploitable
8. Add a super user by running `sudo useradd super`
9. Ensure the user was added by running `id super`
10. `exit` the telnet session then sign out of the Windows machine
11.  Sign in to the Metasploitable machine
12. Open Terminal
13. View the user just created by running `cat /var/log/auth.log | grep super`
14. Run `iptables -P INPUT DROP` to disallow all traffic
15. To allow web traffic, run `iptables -A INPUT -i eth0 -p tcp --dport 80 -j ACCEPT`
16. Sign out and back on to the Windows machine
17. Open Command Prompt as Admin
18. Open `zenmap` and type the Linux IP again
19. Notice Port 80 is now the only opened port 
	- Remember, we allowed web communications; this port is default for HTTP (not HTTPS) web servers.
