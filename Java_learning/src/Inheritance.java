class Shape { // Super class // base class // common / generalization among the subclasses
	int sides;
	private String color; // private members only this class can access, the main method has to access
							// thru its functions get/set
	boolean filled;

	Shape() {
		System.out.println("This is Base class constructor - Shape");
	}

	public Shape(int s, String c, boolean f) {
		// TODO Auto-generated constructor stub
		this.sides = s;
		this.color = c;
		this.filled = f;
	}

	// access modifiers: public,private, protected, default

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

}

class Rectangle extends Shape { // Sub-class // derived class // specialized features
	Rectangle() {
		System.out.println("This is Sub class constructor - Rectangle");
	}

	Rectangle(int s, String c, boolean f, int l, int b) {
		super(s, c, f);
		this.l = l;
		this.b = b;

	}

	double l, b;

	double Perimeter() {
		return 2 * (l + b);
	}

	double Area() {
		return l * b;
	}

}

class Triangle extends Shape { // sub class

}

class Circle extends Shape {

}

class Square extends Shape {

}

class EquilateralTriangle extends Triangle {
	// its own features + triangle + shape
}

public class Inheritance {
//Defining main() function
	public static void main(String[] args) {
		System.out.println("Constructor Chaining:");
		// the constructor called for a class invokes the constructors of all its parent
		// classes until itself
		Rectangle r1 = new Rectangle();
		r1.sides = 4;
		r1.setColor("green"); // since color is private we can't directly handle color, so we access thru its
								// functions
		r1.filled = true;
		r1.l = 5;
		r1.b = 10;

		System.out.println("---------x-----x---------");
		System.out.println("The Rectangle color is:" + r1.getColor());
		System.out.println("The rectangle filled ?:" + r1.isFilled());
		System.out.println("The area is :" + r1.Area());
		System.out.println("The Perimeter is:" + r1.Perimeter());
		System.out.println("---------x-----x---------");

		Rectangle r2 = new Rectangle(5, "Red", false, 10, 20); // created using super
		System.out.println("This object is created using SUPER");
		System.out.println("The Rectangle color is:" + r2.getColor());
		System.out.println("The rectangle filled ?:" + r2.isFilled());
		System.out.println("The area is :" + r2.Area());
		System.out.println("The Perimeter is:" + r2.Perimeter());
		System.out.println("---------x-----x---------");

	}
}
