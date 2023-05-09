package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    private static final int MAX_INT = 1000;

    public static void engineQuestionUpdate() {
        int randomNumber = Engine.RANDOM.nextInt(MAX_INT);
        Engine.setQuestion(String.valueOf(randomNumber));
        Engine.setCorrectAnswer(randomNumber % 2 == 0 ? "yes" : "no");
    }

    public static String getGameCondition() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
}
