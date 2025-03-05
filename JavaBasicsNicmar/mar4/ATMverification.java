
import java.util.Scanner;

public class ATMverification {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your pin: ");
        // int enteredpin = sc.nextInt();
        int pin = 1234;
        int attempts = 3;
        while (attempts>0) {
            System.out.print("Enter your pin: ");
        int enteredpin = sc.nextInt();
            if(enteredpin == pin){
                System.out.println("Pin is verified");
                break;
            }else{
                attempts--;
                System.out.println("Invalid pin!!");
            }  
            
        }
        if(attempts == 0){
            System.out.println("Attempts are over");
        }
    }
}