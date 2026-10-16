import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner attempt = new Scanner(System.in);
        System.out.println("Enter ATM PIN(min 4 simbols):");
        System.out.println("Attempts left:3");
        int pin = attempt.nextInt();
        if (pin == 1234) {
            System.out.println("Access granted!");
        } else {
            Scanner secondatt = new Scanner(System.in);
            System.out.println("Incorrect PIN");
            System.out.println("Attempts left:2");
            int pin2 = attempt.nextInt();
            if (pin == 1234) {
                System.out.println("Access granted!");
            } else {
                Scanner thirdatt = new Scanner(System.in);
                System.out.println("Incorrect PIN");
                System.out.println("Attempts left:1");
                int pin3 = attempt.nextInt();
                if (pin == 1234) {
                    System.out.println("Access granted!");
                } else {

                    System.out.println("Incorrect PIN");
                    System.out.println("Attempts left:0");
                    System.out.println("Card blocked");
                }
            }

        }
    }
}