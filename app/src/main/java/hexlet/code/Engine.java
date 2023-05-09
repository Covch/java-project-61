package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public abstract class Engine implements Game {
    private static final int MAX_ROUNDS = 3;
    protected final Random random;

    public Engine() {
        random = new Random();
    }

    public void game(Scanner scanner) {
        String userName = Cli.newUserGreetings(scanner);
        System.out.println(getGameCondition());
        for (int round = 1; round <= MAX_ROUNDS; round++) {
            String correctAnswer = askQuestionAndGetCorrectAnswer();
            String userAnswer = getUserAnswer(scanner);
            if (correctAnswer.equals(userAnswer)) {
                System.out.println("Correct!");
                continue;
            }
            printCorrectAnswer(correctAnswer, userAnswer);
            System.out.printf("Let's try again, %s!%n", userName);
            return;
        }
        System.out.printf("Congratulations, %s!%n", userName);
    }

    protected abstract String getGameCondition();

    protected abstract String askQuestionAndGetCorrectAnswer();

    private String getUserAnswer(Scanner sc) {
        return sc.next();
    }

    private void printCorrectAnswer(String correctAnswer, String userAnswer) {
        System.out.printf("Your answer: %s%n", userAnswer);
        System.out.printf(
                "'%s' is wrong answer ;(. Correct answer was '%s'.%n",
                userAnswer,
                correctAnswer
        );
    }
}
