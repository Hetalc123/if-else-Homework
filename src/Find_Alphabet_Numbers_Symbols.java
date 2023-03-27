import java.util.Scanner;
//programme to find if entered value is alphabet,number or symbol
public class Find_Alphabet_Numbers_Symbols {
    public static void main(String[] args) {
        //create a scanner object for keyboard input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value:-");//enter char value to be checked
        char value = sc.next().charAt(0);
        //code to be executed
        if(Character.isAlphabetic(value)){
            System.out.println(value + " is Alphabet");
        } else if (Character.isDigit(value)) {
            System.out.println(value + " is Number");
        }else{
            System.out.println(value + " is Symbol");
        }
    }
}
