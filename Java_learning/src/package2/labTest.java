package package2;

import java.util.Scanner;

class InputMismatchException extends Exception {
	public InputMismatchException(String s) {
		super(s);
	}
}

class EvaluationMismatchException extends Exception {
	public EvaluationMismatchException(String s) {
		super(s);
	}
}

class MetricNotFound extends Exception {

	public MetricNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

public class labTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] Java = new String[5];
		int[] a = new int[5];
		int flag;
		int ct = 0;
		System.out.println("Enter the marks of Students");
		for (int i = 0; i < 5; i++) {
			ct++;
			System.out.println("Student" + (i + 1));
			do {
				flag = 0;
				try {
					Java[i] = sc.next();
					a[i] = Integer.parseInt(Java[i]);
					if (a[i] < 0 || a[i] > 100) {
						throw new InputMismatchException("This is mark violation");
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid value entered. TRY AGAIN!");
					flag = 1;
					sc.nextLine();
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Element not present");
				} catch (InputMismatchException ex) {
					System.out.println(ex);
					System.out.println("TRY AGAIN!!");
					flag = 1;
					sc.nextLine();
				}
			} while (flag != 0);

			float mean = 0;
			int sum = 0;
			if (ct == 5) {
				try {
					for (int j = 0; j < 5; j++) {
						sum += a[j];
					}
					mean = sum / 5.0f;
					if (mean <= 50) {
						throw new EvaluationMismatchException("The mean is too low!!");
					} else {
						System.out.println("The Mean is " + mean);
					}
				} catch (EvaluationMismatchException e) {
					System.out.println(e);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Element not present");
				}
			}
		}
		sc.close();
	}
}
