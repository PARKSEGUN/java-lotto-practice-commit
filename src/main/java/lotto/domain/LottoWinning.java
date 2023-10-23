package lotto.domain;

public enum LottoWinning {

    FIRST(2_000_000_000),
    SECOND(30_000_000),
    THIRD(1_500_000),
    FOURTH(50_000),
    FIFTH(5_000);


    private final int winningAmount;

    LottoWinning(int winningAmount) {
        this.winningAmount = winningAmount;
    }

    public int getWinningAmount() {
        return winningAmount;
    }
}
