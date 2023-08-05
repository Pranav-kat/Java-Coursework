import java.util.*;

public class Pranavtest {
	static Scanner sc=new Scanner(System.in);
	static int menu,course,count=0;
	static String appnumb;
	Pranavtest(){
		count++;
		courseSel();
		String app= String.format("%05d",count);
		appnumb=getYear()+"00"+course+app;
	}
	static void courseSel() {
		System.out.println("select a course:-");
		System.out.println("1:BCE 2:BIT 3:BEE 4:BME 5:BCM");
		menu=sc.nextInt();
		switch(menu) {
		case 1:
			course=1;
			break;
		case 2:
			course=2;
			break;
		case 3:
			course=3;
			break;
		case 4:
			course=4;
			break;
		case 5:
			course=5;
			break;
		default:
			System.out.println("Invalid input");
			//courseSel();
			}
	}
	void getapplication() {
		System.out.println("ApplicationNumber= "+appnumb);
	}
	
	/*int getYear() {
		return Calendar.getInstance().get(Calendar.YEAR);
	}*/
	
int getYear() {
	int year = sc.nextInt();	
	
	return year;
	}
	public static void main(String [] aargs) {
		Pranavtest p=new Pranavtest();
		p.courseSel();
		String appnumb;
		String app= String.format("%05d", p.count);
		appnumb=p.getYear()+"00"+p.course+app;
		System.out.println("ApplicationNumber= "+appnumb);
	}
}