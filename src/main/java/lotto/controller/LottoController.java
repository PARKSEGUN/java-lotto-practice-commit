package lotto.controller;

import lotto.domain.Lotto;
import lotto.domain.LottoGame;
import lotto.domain.LottoUser;
import lotto.service.LottoService;
import lotto.view.LottoInputView;

public class LottoController {
    private static final LottoService lottoService = new LottoService();

    public void playGame() {
        while (true) {
            int lottosCount = lottoService.priceToLottosCount(LottoInputView.readPurchaseAmount());
            LottoUser lottoUser = new LottoUser(lottosCount);
            lottoService.purchaseLottos(lottoUser, lottosCount);
            Lotto winningLotto = LottoInputView.readWinningLotto();
            int bonusLottoNumber = LottoInputView.readBonusLottoNumber();
            LottoGame lottoGame = new LottoGame(winningLotto, bonusLottoNumber);
            lottoService.confirmWinningLotto(lottoUser, winningLotto, bonusLottoNumber);
            System.out.println(lottoUser);
        }

    }
    //현재까지 작성한 기능 진행해보고 커밋하고 테스트 코드 까지
}
