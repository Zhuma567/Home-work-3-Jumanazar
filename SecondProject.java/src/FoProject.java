import java.util.Scanner;
public class FoProject {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to the Dastan's calculator");
        System.out.println("Enter first number:");
        int number1 = myObj.nextInt();
        System.out.println("Choose arithmetic operator");
        String choice  = myObj.next();
        System.out.println("Enter second number:");
        int number2 = myObj.nextInt();
        double result = ((double)number1 / (double)number2);
        if (!choice.equals("+") && !choice.equals("-") &&
                !choice.equals("*") && !choice.equals("/") )
        {
            System.out.println("Error");
        }
        if (choice.equals("+"))
        {
            System.out.println( number1 + "+" + number2 +"="+(number1 + number2));
        } else if (choice.equals("-")){
            System.out.println(  number1 + "-" + number2 +"="+(number1 - number2));
        } else if (choice.equals("*")){
            System.out.println(  number1 + "*" + number2 +"="+(number1 * number2));
        } else if (choice.equals("/")) {
            if (number2 == 0) {
                System.out.println("Error");
            } else
                System.out.println(number1 + "/" + number2 + "=" + (result));
        }
    }
}