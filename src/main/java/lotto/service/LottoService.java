package lotto.service;

import lotto.Validator.Validator;

public class LottoService {

    private static final int LOTTO_PRICE = 1000;

    public int priceToLottosCount(int price) {
        Validator.validateDivided(price, LOTTO_PRICE, "[ERROR] 로또 가격으로 나누어 떨어지지 않습니다.");
        return price / LOTTO_PRICE;
    }


}
