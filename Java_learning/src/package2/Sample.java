package package2;

//class Counter {
//
//	int c;
//
//	Counter() {
//		c = 0;
//	}
//
//	void increment() {
//		c++;
//	}
//
//	void decrement() {
//		c--;
//	}
//}
//
//class ThreadA extends Thread {
//
//	Counter obj;
//
//	ThreadA(Counter obj) {
//		this.obj = obj;
//	}
//
//	public void run() {
//		for (int i = 0; i < 10000; i++) {
//			obj.increment();
//		}
//	}
//}
//
//class ThreadB extends Thread {
//
//	Counter obj;
//
//	ThreadB(Counter obj) {
//		this.obj = obj;
//	}
//
//	public void run() {
//		for (int i = 0; i < 10000; i++) {
//			obj.decrement();
//		}
//	}
//}
//
//public class Sample {
//
//	public static void main(String[] args) throws InterruptedException {
//
//// without synchronization
//		Counter obj = new Counter();
//		System.out.println("Before Threads execution: " + obj.c);
//		ThreadA t1 = new ThreadA(obj);
//		ThreadB t2 = new ThreadB(obj);
//
//		t1.start();
//		t2.start();
//		t1.join();
//		t2.join();
//
//		System.out.println("After Threads execution: " + obj.c);
//
//	}
//}

class Counter {

	int c;

	Counter() {
		c = 0;
	}

	synchronized void increment() {
		c++;
	}

	synchronized void decrement() {
		c--;
	}

}

class ThreadA extends Thread {

	Counter obj;

	ThreadA(Counter obj) {
		this.obj = obj;
	}

	public void run() {
		for (int i = 0; i < 10000; i++) {
			obj.increment();
		}
	}
}

class ThreadB extends Thread {

	Counter obj;

	ThreadB(Counter obj) {
		this.obj = obj;
	}

	public void run() {
		for (int i = 0; i < 10000; i++) {
			obj.decrement();
		}
	}
}

public class Sample {

	public static void main(String[] args) throws InterruptedException {

// with synchronization
		Counter obj = new Counter();
		System.out.println("Before Threads execution: " + obj.c);
		ThreadA t1 = new ThreadA(obj);
		ThreadB t2 = new ThreadB(obj);

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println("After Threads execution: " + obj.c);

	}
}
