package section02_structure;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        //read source data
        System.out.println("What is your name?");
        var userName = new Scanner(System.in).nextLine();

        //processing
        var result =  "Hello " + userName + ".";

        //display results
        System.out.println(result);
    }
}
