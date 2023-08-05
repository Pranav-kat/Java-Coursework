package package2;

public class interrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println("curent threAD "+t);
		try {
			for(int k=0;k<100;k++){
				System.out.println(--k);
				if(k==1) {
					t.interrupt();
				}
				Thread.sleep(100);
				k+=3;
				if(k==5)
					t.interrupt();
			}
		}
		catch(InterruptedException ex) {
			System.out.println("Main thread interrupted"+ex);
		}
		System.out.println("End of the main thread");
	}

}
