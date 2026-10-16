import java.util.Scanner;

public class JumaATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000.0;
        int choice;
        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful!");
                        System.out.println("New balance: " + balance);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = sc.nextDouble();
                    if (withdrawal <= 0) {
                        System.out.println("Invalid amount!");
                    } else if (withdrawal > balance) {
                        System.out.println("Not enough money!");
                    } else {
                        balance -= withdrawal;
                        System.out.println("Withdrawal successful!");
                        System.out.println("New balance: " + balance);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}