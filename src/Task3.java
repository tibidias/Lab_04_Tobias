import java.util.Scanner;

public class Task3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double springCost;
        double summerCost;
        double fallCost;
        double winterCost;

        System.out.println("Insert your maintenance cost for the four seasons (spring, summer, fall, winter).");
        springCost = scanner.nextDouble();
        summerCost = scanner.nextDouble();
        fallCost = scanner.nextDouble();
        winterCost = scanner.nextDouble();
        System.out.println("Your yearly maintenance cost would be $" + (springCost + summerCost + fallCost + winterCost) + ".");
    }
}
