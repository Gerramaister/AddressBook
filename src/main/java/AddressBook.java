import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	private ArrayList<PersonInfo> persons;
	private Scanner scanner;

	public AddressBook() {
		scanner = new Scanner(System.in);
		persons = new ArrayList<PersonInfo>();
	}
	
	public void addPerson() {
	
		System.out.println("Enter name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter address: ");
		String address = scanner.nextLine();
		
		System.out.println("Enter phonenumber: ");
		String phonenumber = scanner.nextLine();
		
		PersonInfo person = new PersonInfo(name, address, phonenumber);
		persons.add(person);
	}
	public void searchPerson() {
		
	}
	public void deletePerson() {
		
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
