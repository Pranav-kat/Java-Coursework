import java.util.Scanner;
public class A4input {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a text line: ");
	String text = input.nextLine();
	
	System.out.println("Your line is: "+ text);
	
	// this is for integer input:
	System.out.println("enter a number:");
	int aval = input.nextInt();
	System.out.println(aval);
	
	//this is for double input:
	System.out.println("enter a double type integer");
	double adouble = input.nextDouble();
	System.out.println("your input double is: " + adouble);
	
	input.close();
	}

}
