import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args){
        Random random = new Random();
        Scanner uav = new Scanner(System.in);

        System.out.println("Number Guessing Game!");

    int guess;
    int attempts=0;

    int min = 1;
    int max = 100;
    int randomNumber = random.nextInt(min,max+1);

    do {
        System.out.println("Enter a guess");
        guess=uav.nextInt();
        attempts++;

        if(guess>randomNumber){
            System.out.println("Higher Try Again!");
        }
        else if(guess<randomNumber){
            System.out.println("Lower Try Again");
        }
        else {
            System.out.printf("Correct the number was %d and you took %d attempts to guess the number",guess,attempts);
        }

    }
    while (randomNumber != guess);


    }
}
