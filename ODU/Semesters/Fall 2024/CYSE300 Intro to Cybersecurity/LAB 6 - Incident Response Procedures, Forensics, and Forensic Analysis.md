## LAB 6 - Incident Response Procedures, Forensics, and Forensic Analysis

### Overview

1. Scan a network with nmap/zenmap.
2. Exploit a system using Bruter.
3. Use remote desktop using the stolen credentials from Bruter.

| Key Term | Description                                                                                                  |
| -------- | ------------------------------------------------------------------------------------------------------------ |
| netstat  | A command line tool in Windows and terminal tool in Linux that will provide you with connection information. |
| tasklist | This command, which is built into Windows, will display running processes.                                   |
| ipconfig | These command line Windows tools will display the IP Address and MAC Address of the system.                  |
| path     | This internal command will allow you to set a new path or to display the current path.                       |
| md5sum   | This is a hashing tool that is not native to the Windows operating system.                                   |

### Launching an Attack

1. Sign in to the Windows attack
2. Run `nmap 203.0.113.100` to determine what ports are open
3. Run `zenmap`
4. Enter `203.0.113.100` as the Target then click Scan
5. After scanning, view Ports/Hosts
6. Notice FTP is an open Microsoft service port
7. Launch Bruter.exe attack tool
8. Type `203.0.113.100` in the Target box, leave FTP and Port 21. Type`administrator` for the user
9. Click Browse next to Dictionary
10. Select and open a .txt word list
11. Start the attack
12. Observe the retrieved password
13. Open Command Prompt and ensure RDP is open by running `nmap 203.0.113.100 –p 3389`
14. Open Microsoft Terminal Service Client by running `mstsc`
15. Enter `203.0.113.100` as the Computer then Connect
16. Sign in the to machine and observe the remote desktop

### Collecting Incident Response Data

1. While still logged in to the remote machine, click Start then Computer
2. Double-click IR_TOOLS then cmd.exe
3. Set the PATH to the trusted tool set by running `PATH=E:\`
4. Verify the change by running `PATH`
5. Add Incident Responder to an IR.txt file we'll create by running `echo Incident Responder Student > IR.TXT`
6. Run `type ir.txt` to view the file
7. Add the date to the file by running `date /t >> ir.txt`, then view the file
8. Add the time to the file by running `time /t >> ir.txt`, then view the file
9. Add the ip information to the file by running `ipconfig /all >> ir.txt`, then view the file
10. Add the connection information to the file by running `netstat –ano >> ir.txt`, then view the file 
11. Locate the RDP connection by running `type ir.txt | find “3389”`
12. Add the process information to the file by running `tasklist >> ir.txt`, then view the file 
13. View the svchost processes in the file by running `type ir.txt | find “svchost”`
14. Add the information about logged-on users to the file by running `psloggedon >> ir.txt`
15. View the administrator account by running `type ir.txt | find "administrator"`
16. Add user account information to the file by running `net user >> ir.txt`
17. View the guest account by running `type ir.txt | find "Guest"`
18. Add the time to the file again
19. Hash the file and send the output to hash.txt by running `md5sum ir.txt >> hash.txt`
20. Run `type hash.txt` to view the contents of the file

### Viewing Logs

1. Navigate back to Start then Computer
2. Double-click on the C drive then go to the Windows directory
3. Find the System32 directory then double-click the LogFiles directory
4. Double-click the MSFTPSVC1 directory
5. Double-click the appropriate log file
6. Click Edit then Find
7. Enter 230 then find a successful login