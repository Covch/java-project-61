package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainMenu {
    public static void mainMenu(Scanner sc) {
        System.out.println("Please enter the game number and press Enter.");
        Map<Integer, Engine> ordinalToEngineMap = createGameMap(new EvenGame(), new CalcGame());
        System.out.println("1 - Greet");
        ordinalToEngineMap.values().forEach(Game::printGame);
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        try {
            int choice = sc.nextInt();
            if (choice == 1) {
                Cli.newUserGreetings(sc);
            }
            if (choice > 1) {
                ordinalToEngineMap.get(choice).game(sc);
            }
        } catch (Exception e) {
            System.out.println("Incorrect input. Please try again.");
        }
        System.out.println("Good bye!");
    }

    private static Map<Integer, Engine> createGameMap(Engine... games) {
        return Arrays.stream(games).collect(Collectors.toMap(Game::getOrdinal, Function.identity()));
    }
}
