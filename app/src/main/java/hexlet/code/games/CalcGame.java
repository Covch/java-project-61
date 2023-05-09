package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;

public class CalcGame extends Engine implements Game {
    private static final int MAX_NUMBER = 20;

    @Override
    protected String getGameCondition() {
        return "What is the result of the expression?";
    }

    @Override
    protected String askQuestionAndGetCorrectAnswer() {
        int num1 = random.nextInt(MAX_NUMBER);
        int num2 = random.nextInt(MAX_NUMBER);
        MathOperation mathOperation = MathOperation.values()[random.nextInt(MathOperation.values().length)];
        System.out.printf("Question: %s %s %s%n", num1, mathOperation.getOperation(), num2);
        return String.valueOf(mathOperation.calc(num1, num2));
    }

    @Override
    public int getOrdinal() {
        return 3;
    }

    @Override
    public String getName() {
        return "Calc";
    }

    private enum MathOperation {
        sum("+") {
            @Override
            public int calc(int num1, int num2) {
                return num1 + num2;
            }
        },
        sub("-") {
            @Override
            public int calc(int num1, int num2) {
                return num1 - num2;
            }
        },
        mul("*") {
            @Override
            public int calc(int num1, int num2) {
                return num1 * num2;
            }
        };

        private final String operation;

        MathOperation(String operation) {
            this.operation = operation;
        }

        public abstract int calc(int num1, int num2);

        public String getOperation() {
            return operation;
        }
    }
}
