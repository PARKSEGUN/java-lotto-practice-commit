package lotto.view;

import java.util.List;
import lotto.util.Util;

public class LottoOutputView {
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
