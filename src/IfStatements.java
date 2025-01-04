import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

    Scanner uav = new Scanner(System.in);



        System.out.print("Enter Your Name :");
        String name = uav.nextLine();

        System.out.print("Enter Your Age : ");
        int age = uav.nextInt();
        //GROUP1
        if(name.isEmpty()){
            System.out.println("You did't enter your name 😡");
        }
        else {
            System.out.println("hello "+name + "🎓");
        }


        //GROUP2

        if(age >= 65){

            System.out.println("ypu are a senior ");
        }


        else if (age >= 18){

            System.out.println("You are an adult");

        } else if(age < 0) {

            System.out.println("You haven't born yet");

        }
        else if(age==0){

            System.out.println("you are a baby");


    }
        else{
            System.out.println("You are a child");
        }

    }


}
