package lotto.domain;

import java.util.Collections;
import java.util.List;
import lotto.util.Util;
import lotto.validator.Validator;
import lotto.view.LottoOutputView;

public class Lotto {
    private final static int LOTTO_START_NUMBER = 1;
    private final static int LOTTO_END_NUMBER = 45;
    private final static int LOTTO_SIZE = 6;

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        Collections.sort(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        System.out.println(numbers);
        Validator.validateIntegerListLength(numbers, LOTTO_SIZE);
        Validator.validateIntegerListInRange(numbers, LOTTO_START_NUMBER, LOTTO_END_NUMBER);
        Validator.validateIntegerListHasDifferentNumber(numbers);
    }


    @Override
    public String toString() {
        return "Lotto{" +
                "numbers=" + numbers +
                '}';
    }

    // TODO: 추가 기능 구현


    public void showLottoNumbers() {
        LottoOutputView.printLottoNumbers(this.numbers);
    }

    public static LottoWinning confirmLottos(Lotto userLotto, Lotto winningLotto, int bonusLottoNumber) {
        int count = Util.countSameNumberBetweenIntegerLists(userLotto.numbers, winningLotto.numbers);
        boolean isBonusLottoNumberWinning = userLotto.numbers.contains(bonusLottoNumber);
        return LottoWinning.matchLottoWinning(count, isBonusLottoNumberWinning);
    }

    public void validateLottoNotContainsLottoNumber(int bonusLottoNumber) {
        if (this.numbers.contains(bonusLottoNumber)) {
            throw new IllegalArgumentException("[ERROR]보너스 번호는 당첨번호와 중복된 번호입니다.");
        }
    }
}
