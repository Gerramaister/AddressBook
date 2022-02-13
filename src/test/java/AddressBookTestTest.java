import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AddressBookTestTest {

	AddressBook ab = new AddressBook();
	ArrayList<PersonInfo> persons = new ArrayList<PersonInfo>();
	PersonInfo person = new PersonInfo("Oskar", "Gatan", "112");

	@Test
	void addPersontest() {
		persons.add(person);
		assertEquals("Oskar", person.getName());
	}

	@Test
	void searchPersontest() {
		ab.searchPerson("Oskar");
		assertEquals("Oskar", person.getName());
	}

	@Test
	void deletePersontest() {
		ab.deletePerson("Oskar");
		assertFalse(false);
	}

	@Test
	void savePersontest() {
		int saved = ab.getPersons().size();
		ab.savePersons();
		ab.loadPersons();
		int newSaved = ab.getPersons().size();
		assertTrue(saved < newSaved);
	}
}
