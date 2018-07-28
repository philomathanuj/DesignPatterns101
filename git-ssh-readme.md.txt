1. Navigate to the following directory in windows:
C:\Program Files\Git\bin
2. Click on the 'sh' file.
3. Use the following command to generate public/private ssh key-pair:
$ ssh-keygen -t rsa -C "<your_email_id>"
4. Save the file with some name.
5. File will be saved by default to your user directory, something like : C:/Users/<your_pc_name>
6. Copy these files to a suitable location for future references.
7. Go to github account settings, and add a new ssh-key by copying the public part of the key, something like : ssh-rsa ...
8. Ensure that ssh-agent is running by typing the following in git bash:
# start the ssh-agent in the background
eval $(ssh-agent -s)
Agent pid 59566
9. Add your ssh private key to the ssh-agent.
$ ssh-add <your_private_key>
10. From git bash now clone the repository and enjoy using github.