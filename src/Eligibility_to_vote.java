import java.util.Scanner;
//check eligibility to vote
public class Eligibility_to_vote {
    public static void main(String[] args) {
        //create a scanner object for keyboard input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age-----");//taking input for user's age
        int age = sc.nextInt();
        //condition to be executed
        if(age>=18){
            System.out.println("You are Eligible to Vote");
        }else{
            System.out.println("You are not eligible to vote");//if condition is false
        }
    }
}
