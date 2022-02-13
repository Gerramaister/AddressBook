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