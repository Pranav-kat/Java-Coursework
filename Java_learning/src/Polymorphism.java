abstract class Shape1{ // Super class // base class // common / generalization among the subclasses
    int sides;
    private String color; //private members only this class can access, the main method has to access thru its functions get/set
    boolean filled;

    Shape1(){
    	//System.out.println("This is Base class constructor - Shape");
    }

    public Shape1(int s, String c, boolean f) {
		// TODO Auto-generated constructor stub
    	this.sides=s;
    	this.color=c;
    	this.filled=f;
	}

	//access modifiers: public,private, protected, default  

    public int getSides() {
		return sides;
	}



	public String getColor() {
		return color;
	}



	public boolean isFilled() {
		return filled;
	}



	public void setSides(int sides) {
        this.sides = sides;
    }

 

    public void setColor(String color) {
        this.color = color;
    }

 

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    void display() {
    	System.out.println("This is Super class: Shape");
    }
    
    abstract double Area(); //Hollow function signature w/o def that can be defined in the dericed classes
   
}

 

class Rectangle1 extends Shape1{ // Sub-class // derived class // specialized features
    Rectangle1(){
	//System.out.println("This is Sub class constructor - Rectangle");
    	}
    Rectangle1(int s, String c, boolean f, int l, int b) {
        super(s,c,f);
      this.l=l;
       this.b=b;
    }
	
    double l,b;
    double Perimeter(){
        return 2*(l+b);
    }
    double Area(){
        return l*b;
    }
    
    void display() {
    	System.out.println("This is Sub-class: Rectangle");
    }
    
}


public class Polymorphism
{
//Defining main() function
public static void main(String[] args)
{
    Shape1 r1 = new Rectangle1(4,"green",true,10,20);//runtime polymorphism using upcasting
    r1.display();
    
//    Shape1 s = new Shape1();//runtime polymorphism using upcasting
//    ((Shape1) s).display();//casting
    
    System.out.println(r1);
   // System.out.println(s);
    
    System.out.println(r1.Area());
    
    
}
}



