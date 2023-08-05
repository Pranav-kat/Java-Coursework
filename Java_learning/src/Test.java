interface student_info{
    String name=null,regno=null,subname=null;
}
interface Internal_marks{
    double cat1=0.0,cat2=0.0,quiz1=0.0,quiz2=0.0,da=0.0;
    abstract double TotalInt();
}
interface Fat_marks{
    double fatmark=0.0;
    abstract double Totalext();
}

class Student1 implements Internal_marks,Fat_marks, student_info {
	
    double cat1,cat2,quiz1,quiz2,da,fatmark;
    public Student1(double cat1, double cat2, double q1, double q2, double da, double fatmark) {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.quiz1 = q1;
        this.quiz2 = q2;
        this.da = da;
        this.fatmark = fatmark;
    }
    @Override
    public
    double TotalInt()  {
        return(cat1+cat2+quiz1+quiz2+da);
    }
    @Override
	public
    double Totalext() {
        return(TotalInt()+fatmark);
    }
}
public class Test {
    public static void main(String [] args) {
        Student1 std=new Student1(10,20,30,40,50,60);
        System.out.println(std.TotalInt());
        System.out.println(std.Totalext());
    }
}

