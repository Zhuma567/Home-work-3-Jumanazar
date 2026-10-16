import java.util.Scanner;
public class SeventhProject {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter total purchase amount:");
        int purAmount = myObj.nextInt();
        System.out.println("Are you a premium member?(true / false)");
        boolean prMember = myObj.nextBoolean();
        System.out.println("Number of previous orders:");
        int orders = myObj.nextInt();
        System.out.println("do you have a discount coupon?(true / false)");
        boolean coupon = myObj.nextBoolean();
        System.out.println("Is this your birthday month?(true / false)");
        boolean birthday = myObj.nextBoolean();
        if ((purAmount >= 200) && (prMember == true) && (coupon == true || birthday == true)){
            System.out.println("Original price:"+"$"+purAmount );
            System.out.println("Discount:20%");
            System.out.println("Discount amount:"+"$"+(purAmount*20/100));
            System.out.println("Final price:"+"$"+(purAmount*80/100));
        } else if((purAmount >= 150) && (!prMember == false || orders >=10)){
            System.out.println("Original price:"+"$"+purAmount );
            System.out.println("Discount:15%");
            System.out.println("Discount amount:"+"$"+(double)(purAmount*15/100));
            System.out.println("Final price:"+"$"+(double)(purAmount*85/100));
        } else if((purAmount >= 100) && (coupon == true)){
            System.out.println("Original price:"+"$"+purAmount );
            System.out.println("Discount:10%");
            System.out.println("Discount amount:"+"$"+(double)(purAmount*10/100));
            System.out.println("Final price:"+"$"+(double)(purAmount*90/100));
        } else if (purAmount <= 20){
            System.out.println("Not receive any discount");
        } else {
            System.out.println("No discount");
        }
    }
}