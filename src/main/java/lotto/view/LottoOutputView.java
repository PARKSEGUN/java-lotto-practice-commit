package lotto.view;

import java.util.List;
import lotto.util.Util;

public class LottoOutputView {
    public static void printLottosSize(int lottosSize) {
        System.out.println(lottosSize + "개를 구매했습니다.");
    }

    public static void printLottoNumbers(List<Integer> lottoNumbers) {
        System.out.print("[");
        for (Integer lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber);
            if (lottoNumber.equals(Util.getLastElementByList(lottoNumbers))) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println("]");
    }

}
