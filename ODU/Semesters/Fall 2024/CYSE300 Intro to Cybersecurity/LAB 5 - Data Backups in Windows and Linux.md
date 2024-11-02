## LAB 5 - Data Backups in Windows and Linux

### Backing up the Files in Linux

1. Launch WinSCP from a Windows machine
2. Login to the Linux machine in WinSCP
3. Transfer the necessary necessary backup file(s)
4. Sign out of the Windows machine and into the Linux machine
5. View the transferred files

### Backing up the Files in Windows

1. Sign into the desired Windows machine
2. Open Command Prompt and run `net use x: \\server\share /u:administrator P@ssw0rd`
3. run `net use`
4. Then `cd Downloads` and `dir`
5. Copy the config file to the desired drive (X drive in this case) by running `copy config*.* x:\`
6. Switch to that drive by running `x:` and view the `dir`
7. Log out of the machine and log in to the respective server
8. Click Start then click Computer
9. Examine the C drive and locate the share folder
10. View the copied files
