package hexlet.code.games;

import hexlet.code.Engine;

public class ProgressionGame {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_STEP = 10;
    private static final int MAX_INIT_NUMBER = 20;

    public static String getGameCondition() {
        return "What number is missing in the progression?";
    }

    public static void engineQuestionUpdate() {
        int initNumber = Engine.RANDOM.nextInt(MAX_INIT_NUMBER);
        int step = Engine.RANDOM.nextInt(MAX_STEP);
        int missedElementIndex = Engine.RANDOM.nextInt(PROGRESSION_LENGTH) + 1;
        StringBuilder question = new StringBuilder();
        for (int progressionCounter = 1; progressionCounter <= PROGRESSION_LENGTH; progressionCounter++) {
            int currentProgression = initNumber + step * progressionCounter;
            if (progressionCounter == missedElementIndex) {
                question.append("..");
                Engine.setCorrectAnswer(String.valueOf(currentProgression));
            } else {
                question.append(currentProgression);
            }
            question.append(" ");
        }
        Engine.setQuestion(question.toString());
    }
}
