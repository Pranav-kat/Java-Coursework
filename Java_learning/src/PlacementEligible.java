import java.util.Scanner;

class PlacementEligible{
   public static String year(String s){
        if(s.length()>2)
        return s.substring(0,2);
        else
        return s;
    }
    public static String courseName (String s){
        if(s.substring(2,5).equals("BIT" ))
        return "A";
        else if(s.substring(2,5).equals("BME"))
        return "A";
        else if(s.substring(2,5).equals("BCE"))
        return "A";
        else if(s.substring(2,5).equals("BEE"))
        return "A";
        else if(s.substring(2,5).equals("BCS"))
        return "B";
        else if(s.substring(2,5).equals("BCA"))
        return "B";
        else if(s.substring(2,5).equals("MIT"))
        return "C";
        else if(s.substring(2,5).equals("MCS"))
        return "C";
        else if(s.substring(2,5).equals("MPC"))
        return "C";
        else if(s.substring(2,5).equals("MSE"))
        return "D";
        else if(s.substring(2,5).equals("MIS"))
        return "D";
        return "";
    }
    public static void placementCheck(String s){
        if(courseName(s).equals("A")){
            if(year(s).equals("21"))
            System.out.println(s+": Not eligible for Placement due to First Year Student");
            else if(year(s).equals("20"))
            System.out.println(s+": Not eligible for Placement due to Second Year Student");
            else if(year(s).equals("19"))
            System.out.println(s+": Not eligible for Placement due to Third Year Student");
            else if(year(s).equals("18"))
            System.out.println(s+": Eligible for Placement due to Final Year Student");
            else
            System.out.println(s+": Not eligible for Placement due to Passed out(Duration Over) Student");
        }
        else if(courseName(s).equals("B")){
            if(year(s).equals("21"))
            System.out.println(s+": Not eligible for Placement due to First Year Student");
            else if(year(s).equals("20"))
            System.out.println(s+": Not eligible for Placement due to Second Year Student");
            else if(year(s).equals("19"))
            System.out.println(s+": Eligible for Placement due to Final Year Student");
            else
            System.out.println(s+": Not eligible for Placement due to Passed out(Duration Over) Student");
        }
        else if(courseName(s).equals("C")){
            if(year(s).equals("21"))
            System.out.println(s+": Not eligible for Placement due to First Year Student");
            else if(year(s).equals("20"))
            System.out.println(s+": Eligible for Placement due to Final Year Student");
            else
            System.out.println(s+": Not eligible for Placement due to Passedout(Duration Over) Student");
        }
        else  if(courseName(s).equals("D")){
            if(year(s).equals("21"))
            System.out.println(s+": Not eligible for Placement due to First Year Student");
            else if(year(s).equals("20"))
            System.out.println(s+": Not eligible for Placement due to Second Year Student");
            else if(year(s).equals("19"))
            System.out.println(s+": Not eligible for Placement due to Third Year Student");
            else if(year(s).equals("18"))
            System.out.println(s+": Not eligible for Placement due to Third Year Student");
            else if(year(s).equals("17"))
            System.out.println(s+": Eligible for Placement due to Final Year Student");
            else
            System.out.println(s+": Not eligible for Placement due to Passedout(Duration Over) Student");
        }
        else{
            System.out.println("Not an Eligible course");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.print("Enter no.of students: ");
        no = sc.nextInt();
        String[] regno = new String[no];
        System.out.println("Enter "+no+" Regnos of students:");
        for(int i=0;i<no;i++)
            regno[i]=sc.next();
        
        for(int i=0;i<no;i++)
            placementCheck(regno[i]);
        sc.close();
    }
}
