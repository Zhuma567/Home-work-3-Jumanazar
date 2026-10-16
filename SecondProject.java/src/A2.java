import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);
        System.out.println("Enter ATM PIN(min 4 simbols):");
        System.out.println("Attempts left:5");
        int guess = guess.nextInt();
        if (guess == 16) {
            System.out.println("Correct!");
            System.out.println("You needed 1 attempt");
        } else {
            Scanner guess = new Scanner(System.in);
            System.out.println("Incorrect PIN");
            System.out.println("Attempts left:4");
            int pin2 = guess.nextInt();
            if (pin == 1234) {
                System.out.println("Access granted!");
            } else {
                Scanner thirdatt = new Scanner(System.in);
                System.out.println("Incorrect PIN");
                System.out.println("Attempts left:3");
                int pin3 = guess.nextInt();
                if (pin == 1234) {
                    System.out.println("Access granted!");
                } else {

                    System.out.println("Incorrect PIN");
                    System.out.println("Attempts left:2");

                }
            }

        }
    }
}