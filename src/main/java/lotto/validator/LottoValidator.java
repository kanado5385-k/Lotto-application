package lotto.validator;

import java.util.List;

import lotto.enums.messages.ErrorMessage;

public class LottoValidator {

    public static void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_LOTTO_QUANTITY.getMessage());
        }
    }
}
