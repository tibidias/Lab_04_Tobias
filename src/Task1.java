public class Task1 {
    static void main() {
        int intOperandA = 3;
        int intOperandB = 4;
        int intSum = intOperandA + intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;
        double doubleOperandA = 3.5;
        double doubleOperandB = 4.7;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModulo = doubleOperandA % doubleOperandB;

        System.out.println("The sum using ints of " + intOperandA +  " " + intOperandB +  "  is " + intSum);
        System.out.println("The sum using doubles of " + doubleOperandA +  " " + doubleOperandB +  "  is " + intSum);
        System.out.println("The difference using ints of " + intOperandA +  " " + intOperandB +  "  is " + intDifference);
        System.out.println("The difference using doubles of " + doubleOperandA +  " " + doubleOperandB +  "  is " + intSum);
        System.out.println("The product using ints of " + intOperandA +  " " + intOperandB +  "  is " + intProduct);
        System.out.println("The product using doubles of " + doubleOperandA +  " " + doubleOperandB +  "  is " + doubleProduct);
        System.out.println("The quotient using ints of " + intOperandA +  " " + intOperandB +  "  is " + intDifference);
        System.out.println("The quotient using doubles of " + doubleOperandA +  " " + doubleOperandB +  "  is " + doubleQuotient);
        System.out.println("The modulo using ints of " + intOperandA +  " " + intOperandB +  "  is " + intModulo);
        System.out.println("The modulo using doubles of " + doubleOperandA +  " " + doubleOperandB +  "  is " + doubleModulo);
    }
}
