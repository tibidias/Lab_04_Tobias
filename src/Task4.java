public class Task4 {
    static void main() {
        int creditBalance = 5000;
        double oneMonthBalance = (double)(creditBalance * 1.17);
        double twoMonthBalance = (double)(creditBalance * (1.17 * 1.17));

        System.out.println("With a balance of $5000 and a 17% interest rate after one month the balance would be $" + oneMonthBalance + " and after two months the balance would be $" + twoMonthBalance + ".");
    }
}
