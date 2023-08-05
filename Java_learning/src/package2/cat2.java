package package2;

import java.util.Scanner;

class seatbook{
	int tutseats=200;
	int goers=1;
	int left=200;
	
	synchronized public void book() {
		goers++;
		left=tutseats-goers;
	}
	
	synchronized public void cancel() {
		goers--;
		left = tutseats-goers;
	}
	
	public void display() {
		System.out.println("Total number of seats:"+tutseats);
		System.out.println("goers:"+goers);
		System.out.println("left:"+left);
	}
}

class B extends Thread{
	seatbook sb;
	B(seatbook sb){
		this.sb=sb;
	}
	public void run() {
		sb.book();
	}
}

class C extends Thread{
	seatbook sb;
	C(seatbook sb){
		this.sb=sb;
	}
	
	public void run() {
		sb.cancel();
	}
}


public class cat2 {
	public static void main(String[] args) {
		seatbook sb = new seatbook();
		int a;
		System.out.println("Do you want to book?");
		System.out.println("If yes press 1");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		B a1 = new B(sb);
		a1.start();
		sb.display();
		System.out.println("After cancelling..");
		C b1 = new C(sb);
		b1.start();
		sb.display();
	}

}
