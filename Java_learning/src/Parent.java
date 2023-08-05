
interface Husband extends Parent {
	//public static final String Fathername = "";
	public void GetSonDetails();
}

interface Wife extends Parent {
	//public static final String Mothername = "";
	public void GetSonDetails();
}

class Grandson implements Parent, Husband, Wife {
	public int age = 0;
	public String Name = "";
	public String sex = "";
	

	@Override
	public void GetSonDetails() {
		System.out.println("The Grandson's name is " + Name);
		

	}

	@Override
	public void GetAge() {
		System.out.println("The Grandson's age is " + age);

	}
}

interface Parent {
	public static void main(String[] args) {
		Grandson x = new Grandson();
		x.Name = "Pranav";
		//x.Mothername = "Shayla";
		x.age = 19;
		x.GetSonDetails();
		x.GetAge();
	}

	public void GetSonDetails();

	public void GetAge();
}
