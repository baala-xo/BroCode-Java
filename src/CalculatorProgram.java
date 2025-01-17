import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args){

        Scanner uav = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation;

        System.out.print("Enter the First Number");
        num1=uav.nextDouble();

        System.out.print("Enter an operator (+,-,*,/,^)");
        operator = uav.next().charAt(0);

        System.out.print("Enter the Second Number");
        num2=uav.nextDouble();

        switch (operator){

            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2==0){
                    System.out.println("Cannot divide by zero");
                    validOperation = false;
                }
                else {
                    result = num1/num2;
                }
            }
            case '^' -> result = Math.pow(num1,num1);
            default -> System.out.println("Invalid Operation");

        }

        System.out.printf("The Answer is : %.2f " , result);

    }
}
