import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {

    Scanner uav = new Scanner(System.in);

        String username;

        System.out.println("Enter new  username: ");
        username=uav.nextLine();
        int length = username.length();

        if(length>12 || length<4 ){
            System.out.println("Username must be between 4-12 charecters");

        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("username must not contain spaces or underscores");
        }
        else {
            System.out.printf("Welcome %s❤️",username);
        }

    }
}
