package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    private static final int MAX_INT = 1000;

    public static void game(Scanner sc, String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int randomNumber = new Random().nextInt(MAX_INT);
            System.out.println("Question: " + randomNumber);
            String userAnswer = sc.next();
            boolean userAnswerBool = Answer.yes.name().equals(userAnswer);
            if (userAnswerBool == (randomNumber % 2 == 0)) {
                System.out.println("Correct!");
                continue;
            }
            System.out.printf(
                    "'%s' is wrong answer ;(. Correct answer was '%s'.%n",
                    userAnswer,
                    userAnswerBool ? Answer.no.name() : Answer.yes.name()
            );
            System.out.printf("Let's try again, %s!%n", userName);
            return;
        }
        System.out.printf("Congratulations, %s!%n", userName);
    }

    private enum Answer {
        yes,
        no
    }
}
