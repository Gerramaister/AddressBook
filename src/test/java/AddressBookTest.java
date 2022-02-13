import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookTest {

	private ArrayList<PersonInfo> persons;
	private Scanner scanner;

	public AddressBookTest() {
		scanner = new Scanner(System.in);
		persons = new ArrayList<PersonInfo>();
		loadPersons();
	}

	public void addPerson(String n, String a, String p) {

		System.out.println("Enter name: ");
		System.out.println(n);
		String name = n;

		System.out.println("Enter address: ");
		System.out.println(a);
		String address = a;

		System.out.println("Enter phonenumber: ");
		System.out.println(p);
		String phonenumber = p;

		PersonInfo person = new PersonInfo(name, address, phonenumber);
		persons.add(person);
	}

	public void searchPerson(String name) {
		
		for(PersonInfo person: persons) {
			
			if(name.equals(person.getName())) {
				System.out.println(person.getName() +" " + person.getAddress()+ " " + person.getPhoneNumber());
			}
			else {
				System.out.println("There is no person with that name");
			}
		}
	}

	public void deletePerson(String name) {

		for (PersonInfo person : persons) {

			if (name.equals(person.getName())) {
				System.out.println(person.getName() + " has now been deleted");
				persons.remove(person);
				return;
			} else {
				System.out.println("Can't delete a person that does not exist!");
			}
		}
	}

	public void savePersons() {
		try {
			PersonInfo p;
			String line;
			FileWriter fw = new FileWriter("SaveContacts.txt");
			PrintWriter pw = new PrintWriter(fw);
			for (int i = 0; i < persons.size(); i++) {
				p = (PersonInfo) persons.get(i);
				line = p.getName() + ", " + p.getAddress() + ", " + p.getPhoneNumber();

				// Write line to SaveContacts.txt
				pw.println(line);
			}
			pw.flush();
			pw.close();
			fw.close();
		} catch (IOException ioEx) {
			System.out.println(ioEx);
		}
	}

	// load contacts saved in "SaveContacts.txt"
	public void loadPersons() {
		String tokens[] = null;
		String name, add, pn;
		try {
			FileReader fr = new FileReader("SaveContacts.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				tokens = line.split(",");
				name = tokens[0];
				add = tokens[1];
				pn = tokens[2];
				PersonInfo p = new PersonInfo(name, add, pn);
				persons.add(p);
				line = br.readLine();
			}
			br.close();
			fr.close();
		} catch (IOException ioEx) {
			System.out.println(ioEx);
		}
	}

	public ArrayList<PersonInfo> getPersons() {
		return persons;
	}

}