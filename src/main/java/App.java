import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to your Address Book! Start with entering your first contact.");
		addressBook.addPerson();

		while(true) {
			System.out.println("Whould you like to ad another person?");
				if(scanner.nextLine().equals("yes")) {
					addressBook.addPerson();
					addressBook.savePersons();
				}
				break;
		}		
		System.out.println();
	}
	

}
