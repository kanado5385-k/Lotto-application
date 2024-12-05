package lotto.service;

import java.util.List;

import lotto.domain.ProfitCalculator;
import lotto.dto.ProfitCalculatorDTO;
import lotto.dto.WinningStatisticDTO;
import lotto.enums.WinningPrice;
import lotto.factory.DomainFactory;
import lotto.model.Lotto;
import lotto.model.Lottos;
import lotto.model.Money;
import lotto.model.WinningNumbers;

public class LottoService {
    Integer totalPrice = 0;

    public ProfitCalculatorDTO createProfitCalculatorDTO (Money money, DomainFactory domainFactory) {
        int inputMoney = money.getInputMoney();
        ProfitCalculator profitCalculator = domainFactory.cteateProfitCalculator();
        double profitRate = profitCalculator.calculateProfitRate(totalPrice, inputMoney);
        return new ProfitCalculatorDTO(profitRate);
    }

    public WinningStatisticDTO createWinningStatisticDTO (WinningNumbers winningNumbers, Lottos lottos) {
        int firstPlace = 0;
        int secondPlace = 0;
        int thirdPlace = 0;
        int fourthPlace = 0;
        int fifthPlace = 0;

        List<Lotto> lottosList =  lottos.getLottos();
        for (Lotto lotto : lottosList) {
            List<Integer> lottoNumbers = lotto.getNumbers();
            WinningPrice type = winningNumbers.calculateWinningStatic(lottoNumbers);

            totalPrice += type.getPrice();
            if (type == WinningPrice.FIFTH_PLACE) {
                fifthPlace ++;
            }
            if (type == WinningPrice.FOURTH_PLACE) {
                fourthPlace ++;
            }
            if (type == WinningPrice.THIRD_PLACE) {
                thirdPlace ++;
            }
            if (type == WinningPrice.SECOND_PLACE) {
                secondPlace ++;
            }
            if (type == WinningPrice.FIRST_PLACE) {
                firstPlace ++;
            }
        }

        return new WinningStatisticDTO(firstPlace, secondPlace, thirdPlace, fourthPlace, fifthPlace);
    }
}
