import java.util.Scanner;

public class Task5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double tempF;
        double tempC;

        System.out.println("Enter your temperature in degrees F.");
        tempF = scanner.nextInt();
        tempC = ((tempF - 32) * 5/9);

        System.out.printf("Your temperature in degrees C is " + tempC + " degrees.");
    }
}
