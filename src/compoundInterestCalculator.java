import java.util.Scanner;


public class compoundInterestCalculator {
    public static void main(String[] args){

        Scanner uav = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount : ");
        principal = uav.nextDouble();

        System.out.print("Enter the interest rate : ");
        rate = uav.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year : ");
        timesCompounded = uav.nextInt();

        System.out.print("Enter the number of years : ");
        years = uav.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded , timesCompounded * years);

        System.out.printf("The amount after %d is ₹%.2f",years,amount );

    uav.close();
    }
}
