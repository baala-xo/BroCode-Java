import java.util.Random;


public class CoinFlip {
    public static void main(String[] args){

        Random random = new Random();

        boolean coinflip = random.nextBoolean();

        if(coinflip){
            System.out.println("Heads");

        }
        else{
            System.out.println("Tails");

        }


    }
}
