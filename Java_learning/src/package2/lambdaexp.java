package package2;

import java.util.ArrayList;

//lambda expression in java

interface X {
	public void display(); // two mwthods in this interface wont work

}

interface Y{
	public void display(int a);
}

//class A implements X {
//	public void display() {
//		System.out.println("This is interface implementation");
//	}
//}
//
public class lambdaexp {
	public static void main(String[] args) {

		// GUI implementation by lambda exp
		X obj = new X() { // total three classes created: 1 interface and 2 classes

			public void display() {
				System.out.println("This is interface imp using anonymous inner class");
			}

		}; // anonymous inner class
		obj.display();
		
		X obj1;
		obj1=() -> {
			System.out.println("This is interface imp using Lambda Function");
		};
		 obj1.display();
		 
		 Y obj2;
		 //int a =90;
			obj2=(int a) -> {
				for(int i=0;i<2;i++)
				System.out.println("This is interface imp using Lambda Function and a parametrised method "+a);
			};
			 obj2.display(90);
			 
			 
			 ArrayList<String> al = new ArrayList<String>();
			 al.add("Vellore");
			 al.add("Vellore1");
			 al.add("Vellore2");
			 
			 System.out.println("The elements are: "+al+"\n");
			 
			 al.forEach((temp)->{System.out.println("Lambda Expression: "+temp);});
	}
}
