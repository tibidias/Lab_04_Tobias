import java.util.Scanner;


public class Task2 {
    static void main() {
        double userPrice;
        double finalPrice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the price of your purchase.");
        userPrice = scanner.nextDouble();
        finalPrice = userPrice * 1.05;
        System.out.println("Your final price with tax is $" + finalPrice + ".");
    }
}
