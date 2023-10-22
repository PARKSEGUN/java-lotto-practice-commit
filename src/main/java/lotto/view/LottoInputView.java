package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.Validator.Validator;
import lotto.util.Util;

public class LottoInputView {
    public static int readPurchaseAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        String inputString = Console.readLine();
        int inputAmount = Util.StringToInteger(inputString);
        Validator.validateNaturalNumber(inputAmount);
        return inputAmount;
    }

}
