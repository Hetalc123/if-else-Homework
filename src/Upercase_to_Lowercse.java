import java.util.Scanner;
//change alphabet to lowercase from uppercase
public class Upercase_to_Lowercse {
    public static void main(String[] args) {
        //create a scanner object for keyboard input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet in Uppercase");//enter alphabet to be changed
        String a = sc.next();
        System.out.println("Alphabet in Lowercase as : ");
        System.out.println(a.toLowerCase());//alphabet will be printed in lowercase
    }
}
