package section04_conditional;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        //Read source data
        System.out.println("Enter 'a':");
        var a = new Scanner(System.in).nextInt();

        System.out.println("Enter 'b':");
        var b = new Scanner(System.in).nextInt();

        System.out.println("Enter operator: {+,-,*,/,%}");
        var operator = new Scanner(System.in).nextLine().charAt(0);

        //Processing
        String result;//can't use var

        if (operator == '+') {
            result = "a + b = " + (a + b);
        } else if (operator == '-') {
            result = "a - b = " + (a - b);
        } else if (operator == '*') {
            result = "a * b = " + (a * b);
        } else if (operator == '/') {
            result = "a / b = " + (a / b);
        } else if (operator == '%') {
            result = "a % b = " + (a % b);
        } else {
            result = "Unsupported operator: " + operator;
        }

        //Display results
        System.out.println(result);
    }
}
