package hexlet.code.games;

import hexlet.code.Engine;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class PrimeGame extends Engine {
    private static final int MAX_INT = 100;

    @Override
    protected void printGameCondition() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    @Override
    protected String askQuestionAndGetCorrectAnswer() {
        int randomNumber = random.nextInt(MAX_INT);
        System.out.printf("Question: %s%n", randomNumber);
        return checkPrime(randomNumber) ? "yes" : "no";
    }

    private boolean checkPrime(int num) {
        return IntStream.range(2, num).noneMatch(i -> num % i == 0);
    }

    @Override
    public int getOrdinal() {
        return 6;
    }

    @Override
    public String getName() {
        return "Prime";
    }
}
