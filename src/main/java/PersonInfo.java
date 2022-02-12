
public class PersonInfo {
	String name;
	String address;
	String phoneNumber;
	
	public PersonInfo(String n, String a, String p) {
		name = n;
		address = a;
		phoneNumber = p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "PersonInfo [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + " \n]";
	}
	
	
}
