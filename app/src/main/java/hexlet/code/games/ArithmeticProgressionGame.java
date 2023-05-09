package hexlet.code.games;

import hexlet.code.Engine;

public class ArithmeticProgressionGame extends Engine {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_STEP = 10;
    private static final int MAX_INIT_NUMBER = 20;

    @Override
    protected String getGameCondition() {
        return "What number is missing in the progression?";
    }

    @Override
    protected String askQuestionAndGetCorrectAnswer() {
        int initNumber = random.nextInt(MAX_INIT_NUMBER);
        int step = random.nextInt(MAX_STEP);
        int missedElementIndex = random.nextInt(PROGRESSION_LENGTH) + 1;
        System.out.print("Question: ");
        for (int progressionCounter = 1; progressionCounter <= PROGRESSION_LENGTH; progressionCounter++) {
            int currentProgression = initNumber + step * progressionCounter;
            System.out.print(
                    (progressionCounter == missedElementIndex ? ".." : currentProgression) + " "
            );
        }
        System.out.println();
        return String.valueOf(initNumber + step * missedElementIndex);
    }

    @Override
    public int getOrdinal() {
        return 5;
    }

    @Override
    public String getName() {
        return "Progression";
    }
}
