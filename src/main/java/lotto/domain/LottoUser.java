package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class LottoUser {
    private int purchaseAmount;

    private List<Lotto> lottos = new ArrayList<>();

    private List<LottoWinning> lottoWinnings = new ArrayList<>();

    public LottoUser(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public void addLotto(Lotto lotto) {
        this.lottos.add(lotto);
    }
}
