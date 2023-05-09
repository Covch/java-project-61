package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.MathUtils;

public class GcdGame {
    private static final int MAX_INT = 20;

    public static String getGameCondition() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static void engineQuestionUpdate() {
        int num1 = Engine.RANDOM.nextInt(MAX_INT);
        int num2 = Engine.RANDOM.nextInt(MAX_INT);
        Engine.setQuestion(num1 + " " + num2);
        Engine.setCorrectAnswer(String.valueOf(MathUtils.getGcd(num1, num2)));
    }
}
