import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	
	private List<PersonInfo> addressbook = new ArrayList<PersonInfo>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write your name, address and phonenumber.");
		//PersonInfo person1 = new PersonInfo(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
		//PersonInfo person2 = new PersonInfo("Kalle", "Hantverkarvägen 2", "+425678");
		//PersonInfo person3 = new PersonInfo("Lalle", "Hantverkarvägen 3", "+425678");
		//PersonInfo person4 = new PersonInfo("Halle", "Hantverkarvägen 4", "+425678");
		//PersonInfo person5 = new PersonInfo("Falle", "Hantverkarvägen 6", "+425678");
		while(true) {
			System.out.println("Whould you like to ad another person?");
				if(scanner.nextLine().equals("yes")) {
					createPerson(scanner, addressbook);
					
				}
				break;
		}
		createPerson(scanner);
		
		List<PersonInfo> addressbook = new ArrayList<PersonInfo>();
		
		//addressbook.add(person);
		//addressbook.add(person3);
		//addressbook.add(person4);
		//addressbook.add(person5);
		
		System.out.println(addressbook);
	}
	
	public static PersonInfo createPerson(Scanner scanner, List<PersonInfo> addressbook) {
		PersonInfo person = new PersonInfo(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
		addressbook.add(person);
		return person;
	}
}
