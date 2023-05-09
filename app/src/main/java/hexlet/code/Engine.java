package hexlet.code;

import java.util.Random;

public abstract class Engine {
    public static final Random RANDOM = new Random();
    private static final int MAX_ROUNDS = 3;
    private static String question;
    private static String correctAnswer;

    private static boolean playRound(String userName) {
        System.out.print("Question: ");
        System.out.println(question);
        String userAnswer = App.SCANNER.next();
        if (correctAnswer.equals(userAnswer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.printf("Your answer: %s%n", userAnswer);
        System.out.printf(
                "'%s' is wrong answer ;(. Correct answer was '%s'.%n",
                userAnswer,
                correctAnswer
        );
        System.out.printf("Let's try again, %s!%n", userName);
        return false;
    }

    public static void playGame(String gameCondition, Runnable roundQuestionUpdater) {
        String userName = Cli.newUserGreetings();
        System.out.println(gameCondition);
        for (int roundCounter = 0; roundCounter < MAX_ROUNDS; roundCounter++) {
            roundQuestionUpdater.run();
            if (!playRound(userName)) {
                return;
            }
        }
        System.out.printf("Congratulations, %s!%n", userName);
    }

    public static void setQuestion(String question) {
        Engine.question = question;
    }

    public static void setCorrectAnswer(String correctAnswer) {
        Engine.correctAnswer = correctAnswer;
    }
}
