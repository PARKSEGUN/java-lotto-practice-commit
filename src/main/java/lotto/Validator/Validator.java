package lotto.Validator;

public class Validator {
    private static final int INTEGER_ZERO = 0;

    public static void validateDivided(int target, int divideValue, String ExceptionMessage) {
        if (target % divideValue != 0) {
            throw new IllegalArgumentException(ExceptionMessage);
        }
    }


    public static void validateNaturalNumber(int number) {
        if (number < INTEGER_ZERO) {
            throw new IllegalArgumentException("[ERROR]입력된 값은 자연수가 아닙니다.");
        }
    }

    public static void validateStringIsNumber(String inputString) {

    }
}
