package lotto.util;

import java.util.ArrayList;
import java.util.List;
import lotto.Validator.Validator;

public class Util {
    private static final int INTEGER_ZERO = 0;
    private static final int INTEGER_ONE = 1;

    public static <T> Object getLastElementByList(List<T> objectList) {
        if (objectList.size() > INTEGER_ZERO) {
            return objectList.get(objectList.size() - INTEGER_ONE);
        }
        throw new IllegalArgumentException("리스트 크기가 0이면 마지막 원소를 가져올 수 없습니다");
    }

    public static List<Integer> stringArrayToIntegerList(String[] stringArray) {
        for (String s : stringArray) {
            System.out.println(s);
        }
        List<String> strings = stringArrayToStringList(stringArray);
        return stringListToIntegerList(strings);
    }

    public static List<String> stringArrayToStringList(String[] stringArray) {
        List<String> strings = new ArrayList<>();
        for (String string : stringArray) {
            strings.add(string);
        }
        return strings;
    }

    public static List<Integer> stringListToIntegerList(List<String> strings) {
        List<Integer> integers = new ArrayList<>();
        for (String string : strings) {
            integers.add(Util.StringToInteger(string));
        }
        return integers;
    }

    public static int StringToInteger(String string) {
        Validator.validateStringToInteger(string);
        return Integer.parseInt(string);
    }


}
