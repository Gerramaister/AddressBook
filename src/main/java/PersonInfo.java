
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
		
}
