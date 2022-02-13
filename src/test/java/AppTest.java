
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

	public static void main(String[] args) {
		testAddPerson();
		testSearchPerson();
		//testDeletePerson();
		
	}
		@Test
		public static void testAddPerson() {	
		AddressBookTest abT = new AddressBookTest();
		
		int before = abT.getPersons().size();
		System.out.println(before);
		abT.addPerson("Wille", "Vag 1", "1234");
		int after = abT.getPersons().size();
		System.out.println(after);
		assert(before < after);
		}
		
		
		@Test
		public static void testSearchPerson() {
			
		AddressBookTest abT = new AddressBookTest();
		abT.addPerson("Wille", "Vag 1", "1234");
		abT.searchPerson("Wille");
		assertEquals(abT, ("Wille"));		
		}
		
		
//		@Test
//		public static void testDeletePerson() {
//			
//		AddressBookTest abT = new AddressBookTest();
//		abT.addPerson("Wille", "Vag 1", "1234");
//		abT.addPerson("Kalle", "Vag 1", "1234");
//		}
//		
//		
//		@Test 
//		public static void testSavePerson() {
//			
//		AddressBookTest abT = new AddressBookTest();
//		abT.addPerson("Frida", "Vag 1", "1234");
//		
//		assertNotNull(abT.savePersons());	
//		}
		
}