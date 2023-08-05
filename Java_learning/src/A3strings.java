import java.util.Scanner;

public class A3strings {

	public static void main(String[] args) {
		String text = "hey its pk!";
		System.out.println(text);
		System.out.println(text + "how are doing?");
		
		//length of the strings:
		String s1 = "Hello world";
		System.out.println(s1.length());
		
		//charAt function:
		String s2="My name is Pranav";
		System.out.println(s2.charAt(11));
		
		//concatenation of strings
		String s3="Hello, good ";
		System.out.println("Pls enter the correct time period!!");
		String s4;
		Scanner input = new Scanner(System.in);
		s4 = input.nextLine();
		System.out.println(s3.concat(s4));
		
		//Conversion of strings
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//trimming the strings
		String s5 = "  This blank space is left intentionally   ";
		System.out.println(s5.trim());
		
		input.close();
	}

}
