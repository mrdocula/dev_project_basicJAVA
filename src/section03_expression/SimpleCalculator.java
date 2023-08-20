package section03_expression;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Enter 1st number: ");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Enter 2nd number: ");
        var b = new Scanner(System.in).nextInt();

        var resultPlus = a + b;
        var resultMinus = a - b;
        var resultMul = a * b;
        var resultDiv = a / b;
        var resultMod = a % b;

        System.out.println("a + b = " + resultPlus);
        System.out.println("a - b = " + resultMinus);
        System.out.println("a * b = " + resultMul);
        System.out.println("a / b = " + resultDiv);
        System.out.println("a % b = " + resultMod);
    }
}
