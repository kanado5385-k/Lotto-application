package lotto.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lotto.enums.WinningPrice;
import lotto.utilities.Parser;
import lotto.utilities.Splitter;
import lotto.validator.WinningNumbersValidator;

public class WinningNumbers {
    private final List<Integer> winningNumbers;
    private final Integer bonusNumber;

    public WinningNumbers(String winningNumbers, String bonusNumber) {
        List<String> splittedWinningNumbers = Splitter.splitNumbers(winningNumbers);
        List<Integer> intWinningNumbers = Parser.parseNumbersToInt(splittedWinningNumbers);
        WinningNumbersValidator.validateWinningNumbers(intWinningNumbers);

        int intBonusNumber = Parser.parseNumberToInt(bonusNumber);
        WinningNumbersValidator.validateBonusNumber(intBonusNumber, intWinningNumbers);

        this.winningNumbers = intWinningNumbers;
        this.bonusNumber = intBonusNumber;
    }

    public WinningPrice calculateWinningStatic(List<Integer> lottoNumbers) {
        Set<Integer> set1 = new HashSet<>(winningNumbers);

        set1.retainAll(lottoNumbers);
        int commonElementsQuantity = set1.size();

        if (commonElementsQuantity == 3) {
            return WinningPrice.FIFTH_PLACE;
        }

        if (commonElementsQuantity == 4) {
            return WinningPrice.FOURTH_PLACE;
        }

        if (commonElementsQuantity == 5) {
            if (lottoNumbers.contains(bonusNumber)) {
                return WinningPrice.SECOND_PLACE;
            }
            return WinningPrice.THIRD_PLACE;
        }

        if (commonElementsQuantity == 6) {
            return WinningPrice.FIRST_PLACE;
        }

        return WinningPrice.NO_PLACE;
    }

}
