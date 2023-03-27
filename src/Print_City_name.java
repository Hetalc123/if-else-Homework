import java.util.Scanner;
//Printing city name using alphabet
public class Print_City_name {
    public static void main(String[] args) {
        //create a scanner object for keyboard input
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Alphabet:-");//taking input as alphabet
        char letter = sc.next().charAt(0);
        //condition to be executed as many times as needed
        if(letter == 'a'){
            System.out.println("City Name is 'Ahmedabad'");
        } else if (letter == 'b') {
            System.out.println("City Name is 'Boston'");
        } else if (letter == 'c') {
            System.out.println("City Name is 'Chennai'");
        } else if (letter == 'd') {
            System.out.println("City name is 'Div'");
        } else if (letter == 'e') {
            System.out.println("City Name is 'Edinburgh'");
        } else if (letter == 'f') {
            System.out.println("City Name is 'Fatehpur'");
        }else {
            System.out.println("Invalid Entry");//if condition is false
        }
    }
}
