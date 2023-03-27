import java.util.Scanner;
//programme to interchange value of two numbers
public class Interchange_Value_Of_Numbers {
    //calling main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int a and b need to be interchanged
        System.out.print("Enter First Number:"+"\nA=");
        int a = sc.nextInt();
        System.out.print("Enter Second Number:"+"\nB=");
        int b = sc.nextInt();
        System.out.println("Interchanged Values");
        int c;// int c is temporary variable
        //Interchanging values
        c=a;
        a=b;
        b=c;
        //Print interchanged values of a and b
        System.out.println("A= " +a);
        System.out.println("B= " +b);

    }
}
