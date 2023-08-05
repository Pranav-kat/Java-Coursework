package package2;
class CircleWithException {
/** The radius of the circle */
private double radius1;

/** The number of the objects created */
private static int numberOfObjects = 0;

/** Construct a circle with radius 1 */
public CircleWithException() {
this(1.0);
}

/** Construct a circle with a specified radius */
public CircleWithException(double newRadius) {
 setRadius(newRadius);
numberOfObjects++;
}

/** Return radius */
public double getRadius() {
return radius1;
}

/** Set a new radius */
public void setRadius(double newRadius) 
throws IllegalArgumentException { 
if (newRadius >= 0)
radius1 = newRadius;
else
throw new IllegalArgumentException(
    "Radius cant be negative");
}
 /** Return numberOfObjects */
public static int getNumberOfObjects() {
return numberOfObjects;
}

/** Return the area of this circle */
public double findArea() {
    return radius1*radius1*3.14159;
}
}

public class except {
public static void main(String[] args) {
try{
CircleWithException c1 = new CircleWithException(9);
CircleWithException c2 = new CircleWithException(-8);
CircleWithException c3 = new CircleWithException(0);}
catch (IllegalArgumentException ex){
    System.out.println(ex);
}
System.out.println("Number of objects created: " +
CircleWithException.getNumberOfObjects());
}
}

