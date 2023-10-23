package lotto.domain;

import java.util.ArrayList;
import java.util.List;
import lotto.service.LottoService;

public class LottoUser {
    private int purchaseLottosCount = 0;

    private List<Lotto> lottos = new ArrayList<>();
    private List<LottoWinning> lottoWinnings = new ArrayList<>();


    public LottoUser(int purchaseLottosCount) {
        this.purchaseLottosCount = purchaseLottosCount;
        for (int i = 0; i < purchaseLottosCount; i++) {
            lottos.add(LottoService.makeLotto());
        }
    }

    public void addLotto(Lotto lotto) {
        this.purchaseLottosCount++;
        this.lottos.add(lotto);
    }

    public void confirmWinningLotto(Lotto winningLotto, int bonusLottoNumber) {
        for (Lotto lotto : this.lottos) {
            lottoWinnings.add(Lotto.confirmLottos(lotto, winningLotto, bonusLottoNumber));
        }
    }

    @Override
    public String toString() {
        return "LottoUser{" +
                "purchaseLottosCount=" + purchaseLottosCount +
                ", lottos=" + lottos +
                ", lottoWinnings=" + lottoWinnings +
                '}';
    }
}
