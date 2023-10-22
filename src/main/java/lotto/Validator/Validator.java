package lotto.Validator;

public class Validator {
    public static void validateDivided(int target, int divideValue, String ExceptionMessage) {
        if (target % divideValue != 0) {
            throw new IllegalArgumentException(ExceptionMessage);
        }
    }
}
