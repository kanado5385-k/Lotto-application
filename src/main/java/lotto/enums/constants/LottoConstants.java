package lotto.enums.constants;

public enum LottoConstants implements CommonConstants{
    LTTO_PRICE(1000);

    private final int constants;

    LottoConstants(int constants) {
        this.constants = constants;
    }

    @Override
    public Integer getLottoPrice() {
        return constants;
    }
}
