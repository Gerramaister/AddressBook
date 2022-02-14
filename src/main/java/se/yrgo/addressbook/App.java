/**
 * This is an address book program that takes name, address and phone number as input.
 * You can then save the information into an text file or load the contacts from the text file into the ArrayList.
 * We have split the program into a main class and an address book class.
 * In this main class we use a switch that receives the input choice from the user.
 * Then each case call a function in the AddressBook class.
 * 
 * Known issues:
 * When you enter a invalid choice the program cas an exception and exit.
 * If you delete all contacts inside the ArrayList in the AddressBook class we get a error.
 */

package se.yrgo.addressbook;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		AddressBook ab = new AddressBook();
		Scanner scanner = new Scanner(System.in);

		String search;
		int choice;

		try {
			while (true) {
				System.out.println("Enter any of the following numbers: \n" + "1 - Add \n" + "2 - Search \n"
						+ "3 - Delete \n" + "4 - Save & Exit \n");
				choice = scanner.nextInt();
				scanner.nextLine();
				
				if (choice >= 1 && choice <= 4) {
					switch (choice) {
					case 1:
						ab.addPerson();
						break;
					case 2:
						System.out.println("Who do you want to search for?");
						search = scanner.nextLine();
						ab.searchPerson(search);
						break;
					case 3:
						System.out.println("Who do you want to delete?");
						search = scanner.nextLine();
						ab.deletePerson(search);
						break;
					case 4:
						ab.savePersons();
						System.out.println("Your entered contacts have been saved. \n" + "Goodbye! \n");
						System.exit(0);
					default:
						System.out.println("Enter a choice from 1 to 4. \n");
						break;
					}
				} else {
					System.out.println("You entered a incorrect input!");
					continue;
				}

			}
		} catch (InputMismatchException e) {
			System.out.println("You entered a incorrect input! \n" + "The program will now exit, goodbye!");
		}

	}
}