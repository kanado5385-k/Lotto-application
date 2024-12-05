package lotto.factory;

import lotto.domain.ProfitCalculator;

public class DomainFactory {
    public ProfitCalculator cteateProfitCalculator() {
        return new ProfitCalculator();
    }
}
