package lotto.domain;

public interface ProfitCalculateStrategy {
    
    Integer calculateProfitRate(int totalPrice, int money);
}
