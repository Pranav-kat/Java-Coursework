import java.util.Scanner;

class VITians {
	String name;
	String id;
	String dob;
	String gender;
	String department;

	VITians(String a, String b, String c, String d, String e) {
		name = a;
		id = b;
		dob = c;
		gender = d;
		department = e;
	}

	void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Id number: " + this.id);
		System.out.println("Date of birth: " + this.dob);
		System.out.println("Gender: " + this.gender);
		System.out.println("Department : " + this.department);
	}
}

class Students extends VITians {
	String programm;
	double cgpa;
	int year;
	String p_status;

	Students(String a, String b, String c, String d, String e, String f, double g, int h, String i) {
		super(a, b, c, d, e);
		programm = f;
		cgpa = g;
		year = h;
		p_status = i;
	}

	void display() {
		System.out.println("Program: " + this.programm);
		System.out.println("CGPA: " + this.cgpa);
		System.out.println("Year_of_study: " + this.year);
		System.out.println("Placment_status: " + this.p_status);
	}
}

class Teachers extends VITians {
	String type_of_job;
	double salary;

	Teachers(String a, String b, String c, String d, String e, String f) {
		super(a, b, c, d, e);
		type_of_job = f;
	}

	void set_salary(int basic, int da, int hra) {
		this.salary = basic + da + hra;
	}

	double get_salary() {
		return this.salary;
	}

	void display() {
		System.out.println("Type_of_job: " + this.type_of_job);
	}
}

class TRAs extends Teachers {
	String status_of_Research_Work;

	TRAs(String a, String b, String c, String d, String e, String f, String g) {
		super(a, b, c, d, e, f);
		status_of_Research_Work = g;
	}

	void display() {
		System.out.println("Details of TRA is:");
		System.out.println("Name: " + this.name);
		System.out.println("Id number: " + this.id);
		System.out.println("Date of birth: " + this.dob);
		System.out.println("Gender: " + this.gender);
		System.out.println("Deparment : " + this.department);
		System.out.println("Type_of_job: " + this.type_of_job);
		System.out.println("Status_of_Research_Work: " + this.status_of_Research_Work);
	}
}

class VitianHierarchy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TRAs obj = new TRAs("Pranav Katte", "20BCE0130", "6th June,2002", "Male", "CSE", "Contract", "Intermediate Stage");
		obj.display();
		System.out.println();
		System.out.println("Enter salary details: ");
		System.out.print("Enter basic: ");
		int n = sc.nextInt();
		System.out.print("Enter DA:");
		int m = sc.nextInt();
		System.out.print("Enter HRA:");
		int p = sc.nextInt();
		obj.set_salary(n, m, p);
		double s = obj.get_salary();
		System.out.println("Your salary is:" + s);
		sc.close();
	}
}
