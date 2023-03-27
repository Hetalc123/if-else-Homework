import java.util.Scanner;
//programme to find an average
public class Find_Average {
    public static void main(String[] args) {
        //import scanner class to input user value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:-");
        double num1 = sc.nextDouble();
        System.out.println("Enter Second Number");
        double num2 = sc.nextDouble();
        System.out.println("Enter Third Number");
        double num3 = sc.nextDouble();
        System.out.println("Enter Fourth Number");
        double num4 = sc.nextDouble();
        System.out.println("Enter Fifth Number");
        double num5 = sc.nextDouble();
        //calculate total value
        double total = num1 + num2 + num3 + num4 + num5;
        //calculate an average
        double average = total/5;
        System.out.println("Average of entered Five Numbers is " + average);
    }
}
