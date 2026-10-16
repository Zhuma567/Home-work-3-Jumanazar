import java.util.Scanner;
public class SProject {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your age:");
        int number1 = myObj.nextInt();
        if (number1 >= 18) {
            System.out.println("You can vote");
        }
        else{
            System.out.println("You can not vote");
        }
    }
}