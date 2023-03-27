import java.util.Scanner;
//Programme to initialise grade in student's mark sheet
public class Student_Marksheet {
    //calling main method
    public static void main(String[] args) {
        //import scanner class to input user value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name:-");
        String name = sc.nextLine();
        System.out.println("Roll No.");
        int rn = sc.nextInt();
        System.out.println("----Marks----");
        System.out.println("Physics");
        double phy = sc.nextDouble();
        System.out.println("Biology");
        double bio = sc.nextDouble();
        System.out.println("Chemistry");
        double chem = sc.nextDouble();
        double total = phy + bio + chem;//calculate the total
        System.out.println("Total Marks:-");
        System.out.println(total);
        System.out.println("Percentage");
        double percentage = total/3;//calculate percentage
        System.out.println(percentage);
        System.out.println("Result:-");
        //conditions to be executed to print and allocate the grade
        if(percentage>=80){
            System.out.println("Pass" + " " + "\nThe Grade is A+");
            }else if(percentage>=60){
            System.out.println("Pass" + " " + "\nThe Grade is A");
             } else if (percentage>=50) {
               System.out.println("Pass" + " " + "\nThe Grade is B");
               } else if (percentage>=35) {
                System.out.println("Pass" + " " + "\nThe Grade is C");
        }else {
            System.out.println("Fail");
        }
    }
}
