package lotto.view;

import lotto.dto.ProfitCalculatorDTO;
import lotto.dto.WinningStatisticDTO;
import lotto.enums.messages.IOMessage;

public class OutputView {
    public void printWinningStatistic(WinningStatisticDTO winningStatisticDTO) {
        System.out.println(IOMessage.PRINT_STATISTIC_MESSAGE.getMessage()
            + System.lineSeparator()
            + IOMessage.PRINT_DELIMITER.getMessage());

        System.out.println("3개 일치 (5,000원) - " + winningStatisticDTO.getFifthPlace() + "개");
        System.out.println("4개 일치 (50,000원) - " + winningStatisticDTO.getFourthPlace() + "개");
        System.out.println("5개 일치 (1,500,000원) - " + winningStatisticDTO.getThirdPlace() + "개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + winningStatisticDTO.getSecondPlace() + "개");
        System.out.println("6개 일치 (2,000,000,000원) - " + winningStatisticDTO.getFirstPlace() + "개");
    }

    public void printProfitRate(ProfitCalculatorDTO profitCalculatorDTO) {
        System.out.println(String.format(IOMessage.PRINT_TOTAL_RETURN_RATE.getMessage(), profitCalculatorDTO.getProfitRate()));
    }
}
