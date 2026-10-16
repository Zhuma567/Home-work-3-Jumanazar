public class Juma {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i = i * 10) {
            System.out.println("Before: " + i);

            int after = i * 10;

            System.out.println("After: " + after);
            System.out.println("---");
        }
    }
}
