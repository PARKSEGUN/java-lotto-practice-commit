package lotto.domain;

public enum LottoWinning {

    FIRST(2_000_000_000),
    THIRD(1_500_000),
    FOURTH(50_000),
    FIFTH(5_000),
    NONE(0),
    SECOND(30_000_000),
    ;

    private static final int WINNING_SIZE = 6;

    private final int winningAmount;

    LottoWinning(int winningAmount) {
        this.winningAmount = winningAmount;
    }

    public static LottoWinning matchLottoWinning(int count, boolean isBonusLottoNumberWinning) {
        if (count < 3) {
            return NONE;
        }
        if (count == 5 && isBonusLottoNumberWinning) {
            return SECOND;
        }
        return values()[WINNING_SIZE - count];
    }


    public int getWinningAmount() {
        return winningAmount;
    }
}
