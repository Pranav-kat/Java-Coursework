package package2;

import java.util.*;

public class example {
	public static void main(String[] args) {
		int Total_marks = 0;
		float Average = 0;
		String[] input = new String[5];
		int[] marks = new int[5];
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\nEnter marks for 5 students in Java ");
			try {
				for (int i = 0; i < 5; i++) {
					input[i] = sc.nextLine(); // Throws ArrayIndexOutOfBoundsException if index is greater than or equal
												// to 5
					marks[i] = Integer.parseInt(input[i]); // Throws NumberFormatException if input is invalid
					if (marks[i] < 0 || marks[i] > 100) {
						// Throws User defined exception i.e. InputMismatchException if marks>100 or
						// marks<0
						throw new InputMismatchException("\nValid marks are between 0 and 100");
					}
					Total_marks += marks[i];
					Average = Total_marks / 5;
				}
				if (Average <= 50.0) {
					// Throws User defined exception i.e. EvaluationMismatchException if average is
					// less than or equal to 50
					throw new EvaluationMismatchException("\nAverge marks are less than or equal to 50");
				} else {
					// Display average
					System.out.printf("\nThe average marks are %.2f", Average);
				}
			}

			catch (InputMismatchException e) {
				System.out.println(e);

			} catch (NumberFormatException e) {
				System.out.println("\nInvalid value!!(Only numeric values allowed)");

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("\nValid range is 0 to 4");
			} catch (EvaluationMismatchException e) {
				System.out.println(e);
			}
			System.out.println("\nDo you want to Continue??(y/n)");
			char c = sc.next().charAt(0);
			if (c == 'y' || c == 'Y') {
				Average = 0;
				Total_marks = 0;
				for (int i = 0; i < 5; i++) {
					marks[i] = 0;
					input[i] = "0";
				}

			} else {
				Average = 100;
			}
		} while (Average <= 50);
		sc.close();
	}
}

class InputMismatchException extends Exception {
	InputMismatchException(String msg) {
		super(msg);
	}
}

class EvaluationMismatchException extends Exception {
	EvaluationMismatchException(String msg) {
		super(msg);
	}
}
