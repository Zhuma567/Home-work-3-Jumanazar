import java.util.Scanner;
public class FifthProject{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter attendance points (Max 10)");
        int number1 = myObj.nextInt();
        System.out.println("Enter homework points (Max 60)");
        int number2 = myObj.nextInt();
        System.out.println("Enter exam points (Max 30)");
        int number3 = myObj.nextInt();
        int total = (number1 + number2 + number3);
        if (total > 100 || number1 > 10 || number3 > 60){
            System.out.println("Error: points exceed the maximum!");
        }
        else if (total >= 65 && number1 >= 6 && number3 >= 17 ){
            System.out.println("You have passed");
        } else {
            System.out.println("You have failed");
        }
    }
}