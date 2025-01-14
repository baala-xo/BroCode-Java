public class NestedIfStatement {
    public static void main(String[] args){

        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You got both student and discount offer (30%)");
                price = price * 0.7;
            }
            else {
                System.out.println("you got Student discount (10%)");
                price = price * 0.9 ;
            }
            }
        else{
            if(isSenior){
                System.out.println("Yoy got senior discount (20%)");
                price = price * 0.8;
            }
            else {
                price = price*1;
            }
        }
        System.out.printf("The ticket amount is %.2f",price);
        }

    }

