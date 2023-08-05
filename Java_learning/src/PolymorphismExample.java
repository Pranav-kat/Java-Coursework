import java.util.Scanner;

class Worker {
 String name;
 double salaryRate;
 Worker(){}
 Worker(String n,int s) {
  this.name=n;
  this.salaryRate=s;
 }
 void computePay(double hours) {
 }
 
}

class HourlyWorker extends Worker { 
 public HourlyWorker(String s,int n) {
   super(s,n);
 }
 
  void computePay(Worker a) {
  System.out.println("Name: "+a.name);
  System.out.print("Enter hours worked:");
  Scanner input=new Scanner(System.in);
  int hourWorked=input.nextInt();
  if(hourWorked<50)
   System.out.println("Salary: "+(hourWorked*a.salaryRate));
  else {
   double sum=50*a.salaryRate;
   sum += 0.5 * (hourWorked-50) * a.salaryRate;
   System.out.println("Salary: "+sum);
  }
  input.close();
 }
}

class SalariedWorker extends Worker {
 public SalariedWorker(String s,int n) {
  super(s,n);
 }
 
 void computePay(Worker b) {
  System.out.println("Name: "+b.name);
  System.out.println("Salary: "+(50*b.salaryRate));
 }
}

public class PolymorphismExample {
public static void main(String[] args) {
  HourlyWorker h1=new HourlyWorker("Hourly Worker",50);
  SalariedWorker s1=new SalariedWorker("Salaried Worker",500);
  h1.computePay(h1);
  s1.computePay(s1);
 }
}

