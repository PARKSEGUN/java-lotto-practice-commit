package lotto.domain;

public class LottoGame {
    private final Lotto winningLotto;

    private final int bonusLottoNumber;

    public LottoGame(Lotto winningLotto, int bonusLottoNumber) {
        this.winningLotto = winningLotto;
        winningLotto.validateLottoNotContainsLottoNumber(bonusLottoNumber);
        this.bonusLottoNumber = bonusLottoNumber;
    }


}
