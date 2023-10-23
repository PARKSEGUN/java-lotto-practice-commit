package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import lotto.domain.Lotto;
import lotto.util.Util;
import lotto.validator.Validator;

public class LottoInputView {
    private static final int LOTTO_SIZE = 6;

    public static int readPurchaseAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        String inputString = Console.readLine();
        int inputAmount = Util.StringToInteger(inputString);
        Validator.validateNaturalNumber(inputAmount);
        return inputAmount;
    }

    public static Lotto readWinningLotto() {
        System.out.println("당첨 번호를 입력해 주세요.");
        String winningLottoByString = Console.readLine();
        String[] splitWinningLottoByString = winningLottoByString.split(",");
        List<Integer> winningLottoByList = Util.stringArrayToIntegerList(splitWinningLottoByString);
        return new Lotto(winningLottoByList);
    }

    public static int readBonusLottoNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");
        String bonusLottnumberByString = Console.readLine();
        return Util.StringToInteger(bonusLottnumberByString);
    }

}
