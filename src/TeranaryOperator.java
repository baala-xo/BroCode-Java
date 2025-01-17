import java.util.Locale;
import java.util.Scanner;

public class TeranaryOperator {
    public  static void main(String[] args){

        Scanner uav = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the Temperature ? ");
        temp = uav.nextDouble();

        System.out.print("Covert to celsius or Fahrenheit ? (c or f ? )");
        unit= uav.next().toUpperCase();

        //()?true:false

        newTemp = (unit.equals("C")) ? (temp - 32)*5/9 : (temp*9/5 ) + 32;
        if ((unit.equals("C"))) {
            System.out.printf("Temperature in Celcius %.2f°", newTemp);
        } else {

                System.out.printf("Temperature in Fahrenheit %.2fF", newTemp);

        }

        uav.close();

    }

}
