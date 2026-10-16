import java.util.Scanner;
public class Sixthproject {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = myObj.nextInt();
        System.out.println("Enter your monthly income:");
        int income = myObj.nextInt();
        System.out.println("Enter credit your credit score (0 - 100):");
        int creditscore = myObj.nextInt();
        System.out.println("Enter number of years at current job:");
        int years = myObj.nextInt();
        System.out.println("Do you have existing debt? (True/False)");
        boolean debt = myObj.nextBoolean();
        if ((age >= 21) && (age <= 65) && (income >= 30000) &&
                (creditscore >= 70) && (years >= 2 || debt == false)) {
            System.out.println("Age requirement:✅\n"+
                    "Income requirement: ✅\n" +
                    "Credit score requirement: ✅\n" +
                    "Loan Approved ✅");
        } else {
            System.out.println("The application is rejected ❌");
        }
    }
}