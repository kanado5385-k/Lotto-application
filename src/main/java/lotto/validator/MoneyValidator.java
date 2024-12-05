package lotto.validator;

import lotto.enums.constants.LottoConstants;
import lotto.enums.messages.ErrorMessage;

public class MoneyValidator {
    
    public static void validateMoney(int money) {
        if (money <= 0) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_MONEY.getMessage());
        }
        if (money % LottoConstants.LTTO_PRICE.getLottoPrice() != 0) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_MONEY_UNIT.getMessage());
        }
    }
}
