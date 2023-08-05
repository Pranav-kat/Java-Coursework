package package2;

//TEXT IO USING PRINTWRITER AND SCANNER CLASS

//IMPORTING NECESSARY LIBRARIES
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class FileIO1 {

	public static void main(String[] args) throws Exception {

		// CREATING A NEW FILE
		File file = new File("text1.txt");
		File file1 = new File("Pranav.txt");

		// CHECKING IF FILE EXISTS

		if (file.exists()) {
			System.out.println("File already exists!");
			System.exit(1);
		}

		// WRITING INTO TEXT FILE
		PrintWriter out = new PrintWriter(file1);

		out.print("DC	14	10	4	0	20		\r\n" + "CSK	14	9	5	0	18	    \r\n"
				+ "RCB	14	9	5	0	18	    \r\n" + "KKR	14	7	7	0	14		\r\n"
				+ "MI	14	7	7	0	14		\r\n" + "PK	14	6	8	0	12		\r\n"
				+ "RR	14	5	9	0	10		\r\n" + "SH	14	3	11	0	6       \r\n" + "");

//		out.println("21");
//		
//		out.print("Ankita A Deshpande ");
//		out.println("28");

		out.close();

		System.out.println("Printing done:");

		// PRINTING THE CONTENT OF THE TEXT FILE
		Scanner sc = new Scanner(file);

//		while (in.hasNext()) {
//			String fn = in.nex1qt();
//			int mn = in.nextInt();
//			int ln = in.nextInt();
//			int rn = in.nextInt();
//			int age = in.nextInt();
//
//			System.out.println(fn + " " + mn + " " + ln + " " + rn + " " + age);
//		}
		int[] played = new int[9];
		int[] won = new int[9];
		int[] loss = new int[9];
		String[] name = new String[9];
		int[] tie = new int[9];
		int[] tot = new int[9];
		int mw = 0, ml = 0;
		int win = 0, lost = 0, ctot = 0;
		int totpoint = 12;

		for (int i = 0; i < 8; i++) {
			name[i] = sc.next();
			played[i] = sc.nextInt();
			won[i] = sc.nextInt();
			loss[i] = sc.nextInt();
			tie[i] = sc.nextInt();
			tot[i] = sc.nextInt();
		}

		for (int i = 0; i < 8; i++) {
			if (won[i] > mw) {
				mw = won[i];
				win = i;
			}
		}
		for (int i = 0; i < 8; i++) {
			if (loss[i] > ml) {
				ml = won[i];
				lost = i;
			}
		}
		for (int i = 0; i < 8; i++) {
			if (tot[i] == totpoint) {
				ctot = i;
			}
		}
		sc.close();
		System.out.println("Maximum Matches Won By: " + name[win]);
		System.out.println("Maximum Matches Lost By: " + name[lost]);
		System.out.println("Teams with 12 points:  " + name[ctot]);

		sc.close();
	}

}