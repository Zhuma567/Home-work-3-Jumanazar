import java.util.Scanner;
public class ThProject {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number1 = myObj.nextInt();
        if (number1 % 2 == 1){
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}