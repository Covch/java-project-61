package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    private static final int MAX_NUMBER = 20;

    public static String getGameCondition() {
        return "What is the result of the expression?";
    }

    public static void engineQuestionUpdate() {
        int num1 = Engine.RANDOM.nextInt(MAX_NUMBER);
        int num2 = Engine.RANDOM.nextInt(MAX_NUMBER);
        MathOperation mathOperation = MathOperation.values()[Engine.RANDOM.nextInt(MathOperation.values().length)];
        Engine.setQuestion(num1 + " " + mathOperation.getOperation() + " " + num2);
        Engine.setCorrectAnswer(String.valueOf(mathOperation.calc(num1, num2)));
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
