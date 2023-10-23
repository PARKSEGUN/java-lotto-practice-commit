package lotto.Validator;

import java.util.List;

public class Validator {
    private static final int INTEGER_ZERO = 0;

    public static void validateStringToInteger(String string) {
        try {
            Integer.parseInt(string);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR]입력이 잘못 되었습니다.");
        }
    }

    public static void validateDivided(int target, int divideValue) {
        if (target % divideValue != 0) {
            throw new IllegalArgumentException("[ERROR]숫자가 나누어떨어지지 않습니다.");
        }
    }


    public static void validateNaturalNumber(int number) {
        if (number < INTEGER_ZERO) {
            throw new IllegalArgumentException("[ERROR]입력된 값은 자연수가 아닙니다.");
        }
    }

    public static void validateIntegerListInRange(List<Integer> integerList, int start, int end) {
        for (Integer integer : integerList) {
            validateNumberInRange(integer, start, end);
        }
    }

    public static void validateStringContainsTargetString(String string, String target) {
        if (!string.contains(target)) {
            throw new IllegalArgumentException("[ERROR]" + target + "을 포함하지 않습니다.");
        }
    }

    public static void validateNumberInRange(int number, int start, int end) {
        if (number < start || number > end) {
            throw new IllegalArgumentException("[ERROR]값이 범위 내에 있지 않습니다");
        }
    }

    public static void validateStringArrayLength(String[] stringArray, int length) {
        if (stringArray.length != length) {
            throw new IllegalArgumentException("[ERRER]',' 을 기준으로 입력해주세요.");
        }
    }

    public static void validateIntegerListLength(List<Integer> numbers, int length) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] ',' 을 기준으로 6자리 숫자가 입력되어야합니다.");
        }
    }

    public static void validateIntegerListHasDifferentNumber(List<Integer> integers) {
        for (Integer integer : integers) {
            if (integers.contains(integer)) {
                throw new IllegalArgumentException("중복된 원소를 갖을 수 없습니다.");
            }
        }
    }
}
