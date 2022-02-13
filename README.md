
This is a simple AddressBook made by three students at Yrgo as a school project in the course "Development tools".
The programs is operated through cmd or any other terminal on your computer. 
The programs purpose is to store contacts with name, address and phonenumber. 
The contacts are written to a .txt file which are stored on the local computer.
The functions which are available are as follows: You are able to add new contacts, search for stored contacts and delete contacts.
Everytime you start the program the contacts saved in the .txt file will be loaded in to the program.

To run the programs you need JDK 11.0 installed and MAVEN.
Open cmd or powershell.
Navigate to where you downloaded the folder "AddressBook".
go to directory \AddressBook\target\ with cd \AddressBook\target\.
Type: mvn clean package and press enter.
Type: Java -jar AddressBook-0.0.1-SNAPSHOT.jar and press enter.
If for some reason you did not get the SaveContacts.txt file you might get an error first time 
running before the file is created.

The Addressbook should now start.
