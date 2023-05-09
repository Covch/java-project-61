package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.MathUtils;

public class PrimeGame {
    private static final int MAX_INT = 100;

    public static String getGameCondition() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static void engineQuestionUpdate() {
        int randomNumber = Engine.RANDOM.nextInt(MAX_INT);
        Engine.setQuestion(String.valueOf(randomNumber));
        Engine.setCorrectAnswer(MathUtils.checkPrime(randomNumber) ? "yes" : "no");
    }
}
