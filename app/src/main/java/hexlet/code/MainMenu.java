package hexlet.code;

import hexlet.code.games.ProgressionGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;

public class MainMenu {
    private static final String MAIN_MENU_CONTENTS = """
            Welcome to the Brain Games!
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            5 - Greet
            6 - Prime
            0 - Exit
            """;

    public static void mainMenu() {
        System.out.println(MAIN_MENU_CONTENTS);
        try {
            switch (App.SCANNER.next()) {
                case "1" -> Cli.newUserGreetings();
                case "2" -> Engine.playGame(EvenGame.getGameCondition(), EvenGame::engineQuestionUpdate);
                case "3" -> Engine.playGame(CalcGame.getGameCondition(), CalcGame::engineQuestionUpdate);
                case "4" -> Engine.playGame(GcdGame.getGameCondition(), GcdGame::engineQuestionUpdate);
                case "5" -> Engine.playGame(ProgressionGame.getGameCondition(), ProgressionGame::engineQuestionUpdate);
                case "6" -> Engine.playGame(PrimeGame.getGameCondition(), PrimeGame::engineQuestionUpdate);
                default -> {
                }
            }
        } catch (Exception e) {
            System.out.println("Incorrect input. Please try again.");
        }
        System.out.println("Good bye!");
    }
}
