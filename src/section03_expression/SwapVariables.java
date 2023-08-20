package section03_expression;

public class SwapVariables {
    public static void main(String[] args) {
        var a = 1;
        var b = 2;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }

}
