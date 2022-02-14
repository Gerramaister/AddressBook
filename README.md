
This is a simple AddressBook made by three students at Yrgo as a school project in the course "Development tools".
The programs is operated through cmd or any other terminal on your computer. 
The programs purpose is to store contacts with name, address and phonenumber. 
The contacts are written to a .txt file which are stored on the local computer.
The functions which are available are as follows: You are able to add new contacts, search for stored contacts and delete contacts.
Everytime you start the program the contacts saved in the .txt file will be loaded in to the program.

To run the program you need JDK 11.0 installed and MAVEN.
Download a zip and extract the content or Clone the directory.
Open cmd or powershell. 
Navigate to where you downloaded the folder " AddressBook " and go inside the directory \AddressBook. 
Now type: “ mvn clean package ” and press enter.
The program should now build without any errors.
When done, type: “ Java -jar target/AddressBook-0.0.1-SNAPSHOT.jar ” and press enter.
If for some reason you did not get the SaveContacts.txt file you might get an error first time running before the file is created.

The Addressbook should now start.
