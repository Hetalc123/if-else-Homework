import java.util.Scanner;
//programme to find the day of week by entering number of day
public class Find_the_day_of_the_week {
    public static void main(String[] args) {
        //create a scanner object for keyboard input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of the day:");//enter the number to get the day of week
        int day = sc.nextInt();
        //code to be executed
        if(day==1){
            System.out.println("Day "+day +" is 'Monday'");
        } else if (day==2) {
            System.out.println("Day "+day +" is 'Tuesday'");
        } else if (day==3) {
            System.out.println("Day "+day +" is 'Wednesday'");
        } else if (day==4) {
            System.out.println("Day "+day +" is 'Thursday'");
        } else if (day==5) {
            System.out.println("Day "+day +" is 'Friday'");
        } else if (day==6) {
            System.out.println("Day "+day +" is 'Satureday'");
        } else if (day==7) {
            System.out.println("Day "+day +" is 'Sunday'");
        }


    }
}
