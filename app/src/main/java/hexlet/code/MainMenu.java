package hexlet.code;

import hexlet.code.games.ArithmeticProgressionGame;
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
            int choice = App.SCANNER.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    Cli.newUserGreetings();
                    break;
                case 2:
                    Engine.playGame(EvenGame.getGameCondition(), EvenGame::engineQuestionUpdate);
                    break;
                case 3:
                    Engine.playGame(CalcGame.getGameCondition(), CalcGame::engineQuestionUpdate);
                    break;
                case 4:
                    Engine.playGame(GcdGame.getGameCondition(), GcdGame::engineQuestionUpdate);
                    break;
                case 5:
                    Engine.playGame(
                            ArithmeticProgressionGame.getGameCondition(),
                            ArithmeticProgressionGame::engineQuestionUpdate
                    );
                    break;
                case 6:
                    Engine.playGame(PrimeGame.getGameCondition(), PrimeGame::engineQuestionUpdate);
                    break;
                default:
                    System.out.println("Unnsupportable option. Please choose something else.");
            }
        } catch (Exception e) {
            System.out.println("Incorrect input. Please try again.");
        }
        System.out.println("Good bye!");
    }
}
