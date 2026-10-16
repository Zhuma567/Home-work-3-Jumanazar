import java.util.Scanner;
public class FProject {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = myObj.nextInt();
        System.out.println("Enter second number:");
        int number2 = myObj.nextInt();
        System.out.println("Enter third number:");
        int number3 = myObj.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println("Greatest number:"+ number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Greatest number:"+number2);
        }
        else if (number3 > number2 && number3 > number1) {
            System.out.println("Greatest number:"+number3);
        }
    }
}