package lotto.domain;

import lotto.validator.Validator;

public class LottoGame {
    private final Lotto winningLotto;

    private final int bonusLottoNumber;

    public LottoGame(Lotto winningLotto, int bonusLottoNumber) {
        this.winningLotto = winningLotto;
        winningLotto.validateBonusNumber(bonusLottoNumber);
        this.bonusLottoNumber = bonusLottoNumber;
    }


}
