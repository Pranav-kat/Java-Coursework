package package2;

import java.util.Scanner;

/*class ThreadA extends Thread{
	   
    @Override
    public void run(){
       
       
        for(int i=1;i<=100;i++){
            System.out.println("Thread A: "+i);
        }
       
       
    }
   
}
class ThreadB extends Thread{
   
    @Override
    public void run(){
       
      for(int i=1;i<=100;i++){
            System.out.println("Thread B: "+i);
        }
       
       
    }
   
}
class ThreadC extends Thread{
   
    @Override
    public void run(){
       
        for(int i=1;i<=100;i++){
            System.out.println("Thread C: "+i);
        }
       
       
    }
   
}*/
       
public class testt {
  public static void main(String[] args)  {
  
//     ThreadA ta = new ThreadA();
//     ThreadB tb = new ThreadB();
//     ThreadC tc = new ThreadC();
     int p;
     System.out.println("Enter the value for p");
     Scanner sc = new Scanner(System.in);
     p=sc.nextInt();
//     ta.start(); // internally start() calls corresponding run()method
//     tb.start();
//     tc.start();
     sc.close();
     System.out.println("The number is "+p);
     
       for(int i=1;i<=100;i++){
            System.out.println("Main Thread: "+i);
        }
    
    
    
  }
}