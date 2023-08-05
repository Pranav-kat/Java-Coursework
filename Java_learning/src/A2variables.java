
public class A2variables {

	public static void main(String[] args) {
		int aValue = 10,p=0;
		short aShort = 93;
		long aLong = 8304;
		double aDouble = 3.4533;
		float aFloat = 5.234f;
		char aChar = 'b';
		boolean aBoolean = true;
		byte aByte = -128;
		int[] tot = new int[aValue];
		for(int i = 0; i<aValue;i++) {
			tot[i]=(int) (Math.random()*100);
			p+=tot[i];
		}
		
		for(int i=0;i<aValue;i++) {
			System.out.println(tot[i]);
		}
		
		char[] grade = new char[aValue];
		
		
		
		System.out.println(p);
		
		System.out.println(aValue);
		System.out.println(aShort);	
		System.out.println(aLong);
		System.out.println(aDouble);
		System.out.println(aFloat);
		System.out.println(aChar);
		System.out.println(aBoolean);
		System.out.println(aByte);
	}

}
