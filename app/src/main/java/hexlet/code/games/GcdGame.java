package hexlet.code.games;

import hexlet.code.Engine;

public class GcdGame extends Engine {
    private static final int MAX_INT = 20;

    @Override
    protected String getGameCondition() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    protected String askQuestionAndGetCorrectAnswer() {
        int num1 = random.nextInt(MAX_INT);
        int num2 = random.nextInt(MAX_INT);
        System.out.printf("Question: %s %s%n", num1, num2);
        return String.valueOf(getGcd(num1, num2));
    }

    private int getGcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return getGcd(num2, num1 % num2);
    }

    @Override
    public int getOrdinal() {
        return 4;
    }

    @Override
    public String getName() {
        return "GCD";
    }
}
