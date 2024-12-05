package lotto.dto;

public class ProfitCalculatorDTO {
    private final double profitRate;

    public ProfitCalculatorDTO(double profitRate) {
        this.profitRate = profitRate;
    }

    public double getProfitRate() {
        return profitRate;
    }
}
