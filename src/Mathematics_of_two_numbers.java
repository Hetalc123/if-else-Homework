import java.util.Scanner;

public class Mathematics_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        double a = sc.nextInt();
        System.out.println("Enter Second Number");
       double b = sc.nextInt();
        System.out.println("Enter Mathematic any Symbol (Ex:+,-,/,*)");
        char symbol = sc.next().charAt(0);
        double addition = a+b;
        double subtraction = a-b;
        double division = a/b;
        double multiplication = a*b;
        if(symbol=='+'){
            System.out.println("Adition of above numbers is " + addition);
        }else if(symbol=='-'){
            System.out.println("Subtraction of above numbers is " + subtraction);
        } else if (symbol=='/') {
            System.out.println("Division of above numbers is " + division);
        }else if(symbol=='*') {
            System.out.println("Multiplication of above numbers is " + multiplication);
        }
    }
}
