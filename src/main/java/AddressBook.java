import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	
	private List<PersonInfo> addressbook;

	public AddressBook(List<PersonInfo> addressbook) {
		this.addressbook = addressbook;
	}
	
	public void addPerson(PersonInfo person) {
	
	}
	
	
	public PersonInfo createPerson(Scanner scanner, List<PersonInfo> addressbook) {
		PersonInfo person = new PersonInfo(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
		this.addressbook.add(person);
		return person;
	}
	
	
	
	
	
	

}
