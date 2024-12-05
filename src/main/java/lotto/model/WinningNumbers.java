package lotto.model;

import java.util.List;

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

}
