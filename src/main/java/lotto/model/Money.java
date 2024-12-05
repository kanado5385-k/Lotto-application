package lotto.model;

import lotto.enums.constants.LottoConstants;
import lotto.utilities.Parser;
import lotto.validator.MoneyValidator;

public class Money {
    private final Integer inputMoney;

    public Money(String money){
        int intMoney = Parser.parseNumberToInt(money);
        MoneyValidator.validateMoney(intMoney);
        this.inputMoney = intMoney;
    }

    public int getLottosQuantity() {
        return inputMoney / LottoConstants.LTTO_PRICE.getLottoPrice();
    }

    public int getInputMoney() {
        return inputMoney;
    }
}
