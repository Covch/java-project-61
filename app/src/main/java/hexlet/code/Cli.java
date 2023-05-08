package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String newUserGreetings(Scanner sc) {
        System.out.print("May I have your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
