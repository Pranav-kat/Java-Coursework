package package2;

class Tenant implements house, owner {
	String house_name, house_address, house_no;
	double rent_amount;
	boolean rented;
	String name, address, email;

	public Tenant() {

	}

	

	public Tenant(String house_name, String house_address, String house_no, double rent_amount, boolean rented,
			String name, String address, String email) {
		super();
		this.house_name = house_name;
		this.house_address = house_address;
		this.house_no = house_no;
		this.rent_amount = rent_amount;
		this.rented = rented;
		this.name = name;
		this.address = address;
		this.email = email;
	}



	@Override
	public void owner_details() {
		System.out.println("Owner's Details:\nName: " + name + "\nAddress: " + address + "\nemail: " + email);
	}

	public void house_details() {
		System.out.println("\nHouse Details:\nRented?: "+rented+"\nName: " + house_name + "\nAddress: " + house_address + "\nHouse number: "
				+ house_no + "\nRent: " + rent_amount);
	}

}

interface house {
	String house_name = "", house_address = "", house_no = "";
	double rent_amount = 0.0;
	boolean rented=false;

	static void house_details() {
	}

}

interface owner {
	String name = "", address = "", email = "";

	abstract void owner_details();

}

public class Test {
	public static void main(String[] args) {
		Tenant r = new Tenant("Aura", "Lincoln street", "8A", 90000.0, false, "Mohan", "Lincoln street", "abc@gmail.com");
		r.owner_details();
		r.house_details();
	}

}
