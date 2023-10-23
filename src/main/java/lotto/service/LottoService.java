package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.domain.Lotto;
import lotto.domain.LottoUser;
import lotto.validator.Validator;

public class LottoService {
    private final static int LOTTO_START_NUMBER = 1;
    private final static int LOTTO_END_NUMBER = 45;
    private final static int LOTTO_SIZE = 6;
    private static final int LOTTO_PRICE = 1000;

    public int priceToLottosCount(int price) {
        Validator.validateDivided(price, LOTTO_PRICE);
        return price / LOTTO_PRICE;
    }

    public void purchaseLottos(LottoUser lottoUser, int purchaseCount) {
        for (int i = 0; i < purchaseCount; i++) {
            lottoUser.addLotto(makeLotto());
        }
    }

    public void confirmWinningLotto(LottoUser lottoUser, Lotto winningLotto, int bonusLottoNumber) {
        lottoUser.confirmWinningLotto(winningLotto, bonusLottoNumber);
    }

    public static Lotto makeLotto() {
        return new Lotto(Randoms.pickUniqueNumbersInRange(LOTTO_START_NUMBER, LOTTO_END_NUMBER, LOTTO_SIZE));
    }

}
