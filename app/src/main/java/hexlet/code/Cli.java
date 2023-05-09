package hexlet.code;

public class Cli {
    public static String newUserGreetings() {
        System.out.print("May I have your name? ");
        String userName = App.SCANNER.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
