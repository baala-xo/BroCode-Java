import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner uav = new Scanner(System.in);

        System.out.println("Enter your Name : ");
        String name = uav.nextLine();

        System.out.println("Enter your Age ");
        int age = uav.nextInt();

        System.out.println("Are you a student ? true/false: ");
        boolean isStudent = uav.nextBoolean();

        System.out.println("What is Your cgpa ");
        double cgpa = uav.nextDouble();



        System.out.printf("Hello "+ name);

        if(age>18){
            System.out.printf(" You are eligible to Participate");
        }
        else{
            System.out.printf(" You are not eligible to participate");
        }

        if(isStudent) {
            System.out.printf(" You are enrolled as student");
        }
            else{
                System.out.printf(" You are not enrolled");
        }


        System.out.printf(" sand your Cgpa is : " + cgpa );



        uav.close();
    }
}
