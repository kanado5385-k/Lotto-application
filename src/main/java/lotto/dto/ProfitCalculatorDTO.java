package lotto.dto;

public class ProfitCalculatorDTO {
    private final Integer profitRate;

    public ProfitCalculatorDTO(Integer profitRate) {
        this.profitRate = profitRate;
    }

    public Integer getProfitRate() {
        return profitRate;
    }
}
