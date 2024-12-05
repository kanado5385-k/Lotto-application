package lotto.validator;

import java.util.HashSet;
import java.util.List;

import lotto.enums.messages.ErrorMessage;

public class WinningNumbersValidator {
    private static final int QUANTITY_OF_WINNING_NUMBERS = 6;

    public static void validateWinningNumbers(List<Integer> winningNumbers) {
        if (winningNumbers.size() != QUANTITY_OF_WINNING_NUMBERS) {
            throw new IllegalArgumentException(
                ErrorMessage.INVALID_WINNING_NUMBERS_QUANTITY.getMessage());
        }
        for (Integer number : winningNumbers) {
            if ((number < 1) || (number > 45)) {
                throw new IllegalArgumentException(ErrorMessage.INVALID_WINNING_NUMBER.getMessage());
            }
        }

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (Integer number : winningNumbers) {
            if (!uniqueNumbers.add(number)) {
                throw new IllegalArgumentException(ErrorMessage.DUPLICATE_WINNING_NUMBER.getMessage());
            }
        }
    }

    public static void validateBonusNumber(int bonusNumber, List<Integer> winningNumbers){
        if ((bonusNumber < 1) || (bonusNumber > 45)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_BONUS_NUMBER.getMessage());
        }

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(bonusNumber);
        for (Integer number : winningNumbers) {
            if (!uniqueNumbers.add(number)) {
                throw new IllegalArgumentException(ErrorMessage.DUPLICATE_BONUS_NUMBER.getMessage());
            }
        }
    }
}
