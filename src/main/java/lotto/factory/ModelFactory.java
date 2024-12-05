package lotto.factory;

import lotto.model.Lotto;
import lotto.model.Lottos;
import lotto.model.Money;
import lotto.model.WinningNumbers;

public class ModelFactory {
    public Lotto createLotto() {
        return new Lotto();
    }

    public Lottos createLottos(Money money) {
        return new Lottos(money);
    }

    public Money createMoney(String inputMoney) {
        return new Money(inputMoney);
    }

    public WinningNumbers createWinningNumbers(String winningNumbers, String bonusNumber) {
        return new WinningNumbers(winningNumbers, bonusNumber);
    }
}
