import java.util.Scanner;
public class Check_Positive_Negative_or_Zero {
    //to check weather number is Positive, negative or Zero
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        double number = sc.nextDouble();// enter number to be checked
       //It checks if number is greater than 0
        if(number>0){
            System.out.println("Number is Positive");
            //It checks if number is less than 0
        } else if (number<0) {
            System.out.println("Number is Negative");
            //it executes 0 if above both conditions don't meet
        }else {
            System.out.println("Number is 0");
        }
    }
}
