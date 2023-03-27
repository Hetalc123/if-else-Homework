import java.util.Scanner;
//calculate employee gross salary
public class Employee_Salary {
    public static void main(String[] args) {
        //import scanner class to input user value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.println("Employee Name: ");
        String name = sc.next();
        System.out.println("Basic Salary: ");
        double salary= sc.nextDouble();
        //calculate HRA which is 10% of basic salary
        double hra = 10*(salary/100);
        System.out.println("HRA = "+hra);
        //calculate DA which is 8% of basic salary
        double da = 8*(salary/100);
        System.out.println("DA = " + da);
        //calculate TA which is 9% of basic salary
        double ta = 9*(salary/100);
        System.out.println("TA = " + ta);
        //calculate PF which is 20% of basic salary
        double pf = 20*(salary/100);
        System.out.println("PF = " + pf);
        //Calculate gross salary
        double gs = salary+hra+da+ta+pf;
        System.out.println("Gross Salay:" + "\n"+gs);




    }
}
