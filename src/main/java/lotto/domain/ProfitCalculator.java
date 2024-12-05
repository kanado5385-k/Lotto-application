package lotto.domain;

public class ProfitCalculator implements ProfitCalculateStrategy {
    
    @Override
    public Integer calculateProfitRate(int totalPrice, int money) {
        return (totalPrice/money) % 100;
    }
}
