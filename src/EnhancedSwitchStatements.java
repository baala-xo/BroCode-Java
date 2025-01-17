import java.util.Scanner;


public class EnhancedSwitchStatements {
    public static void main(String[] args){

        Scanner uav = new Scanner(System.in);

        System.out.println("Enter The day");
        String day = uav.nextLine().toUpperCase();

        switch (day){

            default -> System.out.println(day + " is not a day");
            case "MONDAY" , "TUESDAY" , "WEDNESDAY", "THURSDAY" ,"FRIDAY" -> System.out.println("It is a Weekday");
            case "SATURDAY", "SUNDAY" -> System.out.println("It is a Weekend");

        }

    }
}
