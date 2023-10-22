package lotto.util;

import java.util.List;

public class Util {
    private static final int INTEGER_ZERO = 0;
    private static final int INTEGER_ONE = 1;

    public static <T> Object getLastElementByList(List<T> objectList) {
        if (objectList.size() > INTEGER_ZERO) {
            return objectList.get(objectList.size() - INTEGER_ONE);
        }
        throw new IllegalArgumentException("리스트 크기가 0이면 마지막 원소를 가져올 수 없습니다");
    }

    public static int StringToInteger(String string) {
        try {
            Integer.parseInt(string);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 입력된 값은 숫자가 아닙니다.");
        }
        return Integer.parseInt(string);
    }

}
