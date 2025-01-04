import java.util.Scanner;

public class MathClass {
    public static void main(String[] args){
        /*
        System.out.println(Math.PI + " is PI value(Math.PI)");
        System.out.println(Math.E + " Is Exponential constant(Math.E) ");


        System.out.println(" Power(pow) "+ Math.pow(4,6));

        int abs;
        abs = Math.abs(-20);
        System.out.println(" Absolute Value(abs) "+abs);

        System.out.println("Square root(sqrt) : "+Math.sqrt(9));
        System.out.println("Round value (round): "+Math.round(9.8));
        System.out.println("Round up (ceil): "+Math.ceil(3.2));
        System.out.println("Round down(floor) : "+Math.floor(9.8));
        System.out.println("max "+Math.max(6,2));
        System.out.println("min "+Math.min(6,2));
        System.out.println("\n EXERCISE");
        */

        /*
        //HYPOTENUSE c= math.sqrt(a² + b²)
        Scanner uav = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        double a = uav.nextDouble();

        System.out.println("Enter the value of b : ");
        double b = uav.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The Hypotenuse of side c is : " + Math.round(c) + "cm²");

        uav.close();*/

        //circumference = 2*pi*radius
        //area = pi*radius²
        //volume=4.0/3.0 * pi * radius²

        Scanner uav = new Scanner(System.in);

        System.out.print("Enter the Radius of the circle: ");
        double r = uav.nextDouble();

        double circumference = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r,2);
        double volume = (4.0/3.0) * Math.PI * Math.pow(r,3);
        System.out.println("Circumference of the circle : "+Math.round(circumference) + "cm");
        System.out.println("Area of the circle: " + Math.round(area) + "cm²");
        System.out.println("Volume the cirle : " + Math.round(volume) +"cm³");
    }
}
