package hexlet.code;

import java.util.Scanner;

public class MainMenu {
    public static void mainMenu(Scanner sc) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("2 - Even");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        try {
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    Cli.newUserGreetings(sc);
                    break;
                case 2:
                    String userName = Cli.newUserGreetings(sc);
                    EvenGame.game(sc, userName);
                    break;
                default:
                    System.out.println("This choice is currently unsupported. Come back later!");
            }
        } catch (Exception e) {
            System.out.println("Incorrect input. Please try again.");
        }
        System.out.println("Good bye!");
    }
}
