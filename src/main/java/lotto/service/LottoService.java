package lotto.service;

import lotto.Validator.Validator;
import lotto.domain.Lotto;
import lotto.domain.LottoUser;

public class LottoService {

    private static final int LOTTO_PRICE = 1000;

    public int priceToLottosCount(int price) {
        Validator.validateDivided(price, LOTTO_PRICE);
        return price / LOTTO_PRICE;
    }

    public void purchaseLottos(LottoUser lottoUser, int purchaseCount) {
        for (int i = 0; i < purchaseCount; i++) {
            lottoUser.addLotto(Lotto.makeLotto());
        }
    }

    public void confirmWinningLotto(LottoUser lottoUser, Lotto winningLotto, int bonusLottoNumber) {
        lottoUser.confirmWinningLotto(winningLotto, bonusLottoNumber);
    }


}
