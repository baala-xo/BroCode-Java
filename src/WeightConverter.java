import java.util.Scanner;

public class WeightConverter{
    public static void main(String[] args){

        Scanner uav = new Scanner(System.in);

        System.out.println("Welcome to the weight converter program \n Choose your option(1 or 2)\n 1.convert lbs to kgs \n 2.convert kgs to lbs \n");

        int option = uav.nextInt();

        if (option==1){
            System.out.print("Enter the lbs ");
            double lbs = uav.nextDouble();
            double kgs = lbs/2.2046;

            System.out.printf("The Coverted value : %.2f1kgs",kgs);

        }
        else if (option==2){
            System.out.print("Enter the kgs ");
            double kgs = uav.nextDouble();
            double lbs = kgs*0.453592;

            System.out.printf("The Coverted value : %.2f ",lbs);

        }



        uav.close();
    }
}