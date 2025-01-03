import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args){

        Scanner uav = new Scanner(System.in);

        String adjactive1;
        String adjactive2;
        String adjactive3;
        String noun1;
        String verb1;

        System.out.print("Enter an adjective(descriptive): ");
        adjactive1=uav.nextLine();
        System.out.print("Enter a noun(animal or person): ");
        noun1=uav.nextLine();
        System.out.print("Enter an adjective(descriptive): ");
        adjactive2=uav.nextLine();
        System.out.print("Enter a verb ending with -ing(action): ");
        verb1=uav.nextLine();
        System.out.print("Enter an adjective(descriptive): ");
        adjactive3=uav.nextLine();

        System.out.println("\nToday i went to a " + "zoo.");
        System.out.println("In an exhibit , I saw a "+ noun1 + ".");
        System.out.println(noun1+ " was " + adjactive2 + " and " +verb1 + " !");
        System.out.println("I was " + adjactive3 +"!");

        uav.close();
    }

}
