import javax.swing.JOptionPane;

//import java.util.Scanner;

class Student { // model or template of similar objects data and their functionality
	    int c=5;
	    static int d=10;
    String regno;
    String name;
  Student(){ // default constructor // function/constructor overloading
      
    }
     Student(String regno, String name) { // Parameterized Constructor - function
        this.regno = regno; // current object
        this.name = name;
    }
    
    void reading() {
        System.out.println("The student can do reading!!!");
       
    }    

    void displayData() {
        System.out.println("The data is" + regno + "  " + name);
    }
    
    void displayNum() {
    	System.out.println("The nos are: "+c+" & "+d);
    }

}

 

public class ClassesandObjects {
    public static void main(String args[]) {
        Student Object1 = new Student("111","raja");

 

        //Object1.getData("123","raja");
        Object1.reading();
        Object1.displayData();

 

        Student Object2 = new Student();

       // Object2.getData("222","naga");
        Object2.reading();
        
        Object2.displayData();
        
        Object2=Object1; // pass by reference 
     
        // the output now considers both obj2 adn obj1 as 1 single entity so if you change one whole changes.
        
         Object1.displayData();
          Object2.displayData();
          
          Object1.regno="222";
          Object2.name="venkatesh";
          
            Object1.displayData(); //222, raja (Venkatesh)
          Object2.displayData();  // 111(222), venkatesh
        
        int z =9;
        int a=5;
        int b=a; // pass by value since primitive data type 
        a=a+5;
        System.out.println(a+" "+b);
        System.out.println("--------x----x-------");
        System.out.println("Object Array");
        
        Student[] obg = new Student[3];    //Object Array
        
        for(int i =0;i<3;i++) {
        	obg[i]= new Student("121","PK");
        	//obg[i].name="PK";
        	}
        	
        for (int i =0;i<3;i++) {
        	obg[i].displayData();}
      
        System.out.println("--------x----x-------");
        Student o1 = new Student();
        Student o2 = new Student();
     // non-static data members are individual the objects
     // static data members are commonly (single copy) used by objects
        o1.displayNum(); //c=5, d=10
        o2.displayNum(); // c=5, d=10
        
        o1.c++; // non-static
        Student.d++;  // static
       
        o2.c++;  // non-static
        Student.d++; // static
        
        o1.displayNum(); //c =6, d= 12   
        o2.displayNum(); // c=6 , d= 12 
        
        System.out.println("--------x----x-------");
        //System.out.println("");
    
        o1.displayNum();
        System.out.println("The value of Z is: "+z);//z=9
        
        doModify(o1,z);//z=10
        
        o1.displayNum();
        System.out.println("The value of Z is: "+z);//z=9 because z is primitive type 
        
        doModify(o1,z);//z=10
        
        JOptionPane.showMessageDialog(null, "The final value of z is " + z); 
    }

	private static void doModify(Student o1, int z) {
		// TODO Auto-generated method stub
		z++;
		o1.c++;
		o1.c++;
		System.out.println("The modified z is: "+z);
	}
}
