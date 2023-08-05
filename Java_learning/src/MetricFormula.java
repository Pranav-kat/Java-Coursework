import java.util.Scanner;

public class MetricFormula {

	public static void main(String[] args) {
		int totalNumberOfSubjects = 5;
		float[] score = new float[totalNumberOfSubjects];
		float sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks in the given sequence M,P,C,E,CS:");
		for (int i = 0; i < totalNumberOfSubjects; i++)
			score[i] = sc.nextFloat();
		for (int i = 0; i < totalNumberOfSubjects; i++) {
			sum += score[i];
			// System.out.println(score[i]);
		}
		float OA = sum / totalNumberOfSubjects;

		sc.close();

		float EA = (score[0] * 2 + score[1] + score[2]) / 4;
		float CSA = score[4];
//	        System.out.println(OA);
//	         System.out.println(sum);
//	        System.out.println(EA);
//	        System.out.println(CSA);

		if (OA > 75 && EA > CSA)
			System.out.println("Probable Mech,EEE,Civil,ESE candidate");
		else if (OA > 75 && CSA > EA)
			System.out.println("Probable CSE,IT,IS candidate");
		else if (OA < 75 && CSA > EA)
			System.out.println("Probable BCA candidate");
		else if (OA < 75 && EA > CSA)
			System.out.println("Probable BSc candidate");
		else
			System.out.println("Invalid scores, you failed ");
	}
}
