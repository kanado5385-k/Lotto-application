package lotto.domain;

public class ProfitCalculator implements ProfitCalculateStrategy {
    
    @Override
    public double calculateProfitRate(int totalPrice, int money) {
        return (double)((totalPrice/money) % 100);
    }
}
