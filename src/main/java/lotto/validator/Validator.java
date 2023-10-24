package lotto.validator;

import java.util.List;
import lotto.util.Util;

public class Validator {
    private static final int INTEGER_ZERO = 0;
    private static final int INTEGER_TWO = 2;

    public static void validateStringToInteger(String string) {
        try {
            Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("[ERROR]입력이 잘못 되었습니다.");
            throw new IllegalArgumentException();
        }
    }

    public static void validateDivided(int target, int divideValue) {
        if (target % divideValue != 0) {
            System.out.println("[ERROR]숫자가 나누어떨어지지 않습니다.");
            throw new IllegalArgumentException();
        }
    }


    public static void validateNaturalNumber(int number) {
        if (number <= INTEGER_ZERO) {
            System.out.println("[ERROR]로또를 구매할 수 없습니다.");
            throw new IllegalArgumentException();
        }
    }

    public static void validateIntegerListInRange(List<Integer> integerList, int start, int end) {
        for (Integer integer : integerList) {
            validateNumberInRange(integer, start, end);
        }
    }

    public static void validateIntegerListNotContainsTargetInteger(List<Integer> integers, Integer integer) {
        if (integers.contains(integer)) {
            System.out.println("[ERROR] 값이 중복되었습니다.");
            throw new IllegalArgumentException();
        }
    }

    public static void validateNumberInRange(int number, int start, int end) {
        if (number < start || number > end) {
            System.out.println("[ERROR]값이 범위 내에 있지 않습니다");
            throw new IllegalArgumentException();
        }
    }

    public static void validateStringArrayLength(String[] stringArray, int length) {
        if (stringArray.length != length) {
            System.out.println("[ERRER]',' 을 기준으로 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }

    public static void validateIntegerListLength(List<Integer> numbers, int length) {
        if (numbers.size() != length) {
            System.out.println("[ERROR] ',' 을 기준으로 " + length + "자리 숫자가 입력되어야합니다.");
            throw new IllegalArgumentException();
        }
    }

    public static void validateIntegerListHasDifferentNumber(List<Integer> integers) {
        for (Integer integer : integers) {
            int count = Util.countSameIntegerByIntegers(integer, integers);
            if (count >= INTEGER_TWO) {
                System.out.println("중복된 원소를 갖을 수 없습니다");
                throw new IllegalArgumentException();
            }
        }
    }
}
