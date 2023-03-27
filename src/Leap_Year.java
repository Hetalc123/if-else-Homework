import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        //add Scanner class to input user value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year:-");
        int year = sc.nextInt();//declare and initialise the variable
        //adding condition to be executed
        if(((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
            }else {
            System.out.println(year + " is not a Leap Year");
            }
    }
}
