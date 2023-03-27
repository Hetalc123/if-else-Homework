import java.util.Scanner;
//Programme to create student's result
public class Student_Result {
//calling main method
    public static void main(String[] args) {
        //import Scanner class to input user value
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
        //condition to be executed
        if(phy>=35){
           if(bio>=35){
                if(chem>=35){
                    System.out.println("Pass");
               }else {
                   System.out.println("Fail");
                }
           }else{
                System.out.println("Fail");
            }
        }else{
            System.out.println("Fail");
        }
    }
}
