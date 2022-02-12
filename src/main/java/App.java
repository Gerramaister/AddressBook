import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Write your name, address and phonenumber.");

		while(true) {
			System.out.println("Whould you like to ad another person?");
				if(scanner.nextLine().equals("yes")) {
					createPerson(scanner, addressbook);
					
				}
				break;
		}		
		
		
		System.out.println(addressbook);
	}
	

}
