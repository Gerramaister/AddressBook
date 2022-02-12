import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write your name, address and phonenr.");
		//PersonInfo person1 = new PersonInfo(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
		PersonInfo person2 = new PersonInfo("Kalle", "Hantverkarvägen 2", "+425678");
		PersonInfo person3 = new PersonInfo("Lalle", "Hantverkarvägen 3", "+425678");
		PersonInfo person4 = new PersonInfo("Halle", "Hantverkarvägen 4", "+425678");
		PersonInfo person5 = new PersonInfo("Falle", "Hantverkarvägen 6", "+425678");
		
		
		List<PersonInfo> addressbook = new ArrayList<>();
		
		addressbook.add(person2);
		addressbook.add(person3);
		addressbook.add(person4);
		addressbook.add(person5);
		
		System.out.println(addressbook);
	}
}
