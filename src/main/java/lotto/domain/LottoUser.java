package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class LottoUser {
    private int purchaseLottosCount = 0;

    private List<Lotto> lottos = new ArrayList<>();

    private List<LottoWinning> lottoWinnings = new ArrayList<>();

    public LottoUser(int purchaseLottosCount) {
        this.purchaseLottosCount = purchaseLottosCount;
    }

    public void addLotto(Lotto lotto) {
        this.lottos.add(lotto);
    }
}
