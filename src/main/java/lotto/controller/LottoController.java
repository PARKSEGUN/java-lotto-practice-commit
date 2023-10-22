package lotto.controller;

import lotto.service.LottoService;
import lotto.view.LottoInputView;

public class LottoController {
    private static final LottoService lottoService = new LottoService();
    public void playGame() {
        int purchaseAmount = LottoInputView.readPurchaseAmount();
        int lottosCount = lottoService.priceToLottoCount(purchaseAmount);
    }

}
