package section03_expression;

public class UpdateIncrementDecrement {
    public static void main(String[] args) {
        var a = 0;
        System.out.println(a);

        a = 5;
        System.out.println(a);

        a = a + 3;
        System.out.println(a);

        a += 3;
        System.out.println(a);

        a++;//a += 1 -> a = a + 1
        System.out.println(a);

        a--;//a -= 1 -> a = a - 1
        System.out.println(a);

        a *= 2;
        a = a * 2;

        a /= 3;
        a = a / 3;
    }
}