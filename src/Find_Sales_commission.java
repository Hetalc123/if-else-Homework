import java.util.Scanner;
//programme to calculate commission
public class Find_Sales_commission {
    public static void main(String[] args) {
        //create a scanner object for keyboard input
        Scanner sc = new Scanner(System.in);
        System.out.println("Sales Id:-");
        int id = sc.nextInt();
        System.out.println("Seller's Name:-");
        String name = sc.next();
        System.out.println("Sales Amount:-");
        double amount = sc.nextDouble();
        System.out.println("Basic Salary");
        double salary = sc.nextDouble();
        //condition to be executed as many times as needed
        //calculating commission as many times as needed
        if(amount >=50000){
            double commission = 35*(amount/100);
            System.out.println("Sales Commission is " + commission);
            }else if (amount>=30000) {
             double commission = 20*(amount/100);
             System.out.println("Sales Commission is " + commission);
             } else if (amount>=20000) {
               double commission = 10*(amount/100);
               System.out.println("Sales Commission is " + commission);
              } else if (amount>=10000) {
                double commission = 5*(amount/100);
                System.out.println("Sales Commission is " + commission);
        }else if(amount<10000){
            double commission = 2*(amount/100);
            System.out.println("Sales Commission is " + commission);
        }
    }
}
