import java.util.Objects;

public class PersonInfo {
	private String name;
	private String address;
	private String phoneNumber;
	
	public PersonInfo(String n, String a, String p) {
		this.name = n;
		this.address = a;
		this.phoneNumber = p;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "--PersonInfo-- Name: " + name + ", Address: " + address + ", Phonenumber: " + phoneNumber + " ";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonInfo other = (PersonInfo) obj;
		return Objects.equals(name, other.name);
	}
		
}
