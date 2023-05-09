package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame extends Engine {
    private static final int MAX_INT = 1000;

    @Override
    protected String getGameCondition() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    protected String askQuestionAndGetCorrectAnswer() {
        int randomNumber = random.nextInt(MAX_INT);
        System.out.printf("Question: %s%n", randomNumber);
        return randomNumber % 2 == 0 ? Answer.yes.name() : Answer.no.name();
    }

    @Override
    public int getOrdinal() {
        return 2;
    }

    @Override
    public String getName() {
        return "Even";
    }

    private enum Answer {
        yes,
        no
    }
}
