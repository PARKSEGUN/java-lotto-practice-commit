package lotto;

import lotto.domain.Lotto;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Lotto lotto = Lotto.makeLotto();
        lotto.showLottoNumbers();
    }
}
