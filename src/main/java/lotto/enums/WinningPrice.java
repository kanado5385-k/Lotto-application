package lotto.enums;

public enum WinningPrice {
    FIRST_PLACE(2000000000),
    SECOND_PLACE(30000000),
    THIRD_PLACE(1500000),
    FOURTH_PLACE(50000),
    FIFTH_PLACE(5000),
    NO_PLACE(0);

    private final int price;

    WinningPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
