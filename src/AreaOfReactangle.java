import java.util.Scanner;

public class AreaOfReactangle {
    public static void main(String[] args){

        double width =0;
        double height =0;
        double area=0;

        Scanner uav = new Scanner(System.in);

        System.out.print("Enter the Width : ");
        width = uav.nextDouble();

        System.out.print("Enter the height : ");
        height = uav.nextDouble();

        area= height * width;

        System.out.println("The are of the Reactangle is "+ area + " cm²");

        uav.close();
    }

}
