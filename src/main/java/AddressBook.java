import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
	
	public void savePersons() {
		try {
			PersonInfo p;
			String line;
			FileWriter fw = new FileWriter("persons.txt");
			PrintWriter pw = new PrintWriter(fw);
			for(int i = 0; i < persons.size(); i++) {
				p = (PersonInfo) persons.get(i);
				line = p.getName() + "," + p.getAddress() + p.getPhoneNumber();
				//Write line to persons.txt
				pw.println(line);
			}
			pw.flush();
			pw.close();
			fw.close();
		}catch(IOException ioEx) {
			System.out.println(ioEx);
		}
		
	}
	
	
}
