package hexlet.code;

import java.util.stream.IntStream;

public class MathUtils {

    public static int getGcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return getGcd(num2, num1 % num2);
    }

    public static boolean checkPrime(int num) {
        return IntStream.range(2, num).noneMatch(i -> num % i == 0);
    }
}
