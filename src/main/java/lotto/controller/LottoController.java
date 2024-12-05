package lotto.controller;

import lotto.dto.ProfitCalculatorDTO;
import lotto.dto.WinningStatisticDTO;
import lotto.factory.DomainFactory;
import lotto.factory.ModelFactory;
import lotto.factory.ServiceFactory;
import lotto.factory.ViewFactory;
import lotto.model.Lottos;
import lotto.model.Money;
import lotto.model.WinningNumbers;
import lotto.service.LottoService;
import lotto.view.ExceptionOutputView;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
    private final DomainFactory domainFactory;
    private final ModelFactory modelFactory;
    private final ServiceFactory serviceFactory;
    private final ViewFactory viewFactory;

    private final InputView inputView;
    private final OutputView outputView;

    public LottoController(DomainFactory domainFactory, ModelFactory modelFactory, 
        ServiceFactory serviceFactory, ViewFactory viewFactory) {
            this.domainFactory = domainFactory;
            this.modelFactory = modelFactory;
            this.serviceFactory = serviceFactory;
            this.viewFactory = viewFactory;

            inputView = viewFactory.createInputView();
            outputView = viewFactory.createOutputView();
    }

    public void startLottoApplication() {
        Money money = createMoney();
        Lottos lottos = createLottos(money);
        WinningNumbers winningNumbers = createWinningNumbers();
        LottoService lottoService = serviceFactory.createLottoService();

        WinningStatisticDTO winningStatisticDTO = lottoService.createWinningStatisticDTO(winningNumbers, lottos);
        outputView.printWinningStatistic(winningStatisticDTO);

        ProfitCalculatorDTO profitCalculatorDTO = lottoService.createProfitCalculatorDTO(money, domainFactory);
        outputView.printProfitRate(profitCalculatorDTO);

    }

    private Money createMoney() {
        while (true) {
            try {
                String stringMoney = inputView.readMoney();
                return modelFactory.createMoney(stringMoney);
            } catch (IllegalArgumentException e) {
                ExceptionOutputView.printErrorMessage(e.getMessage());
            }
        }
    }

    private Lottos createLottos(Money money) {
        while (true) {
            try {
                return modelFactory.createLottos(money, modelFactory);
            } catch (IllegalArgumentException e) {
                ExceptionOutputView.printErrorMessage(e.getMessage());
            }
        }
    }

    private WinningNumbers createWinningNumbers() {
        while (true) {
            try {
                String stringWinningNumbers = inputView.readWinningNumbers();
                String stringBonusNumber = inputView.readBonusNumber();
                return modelFactory.createWinningNumbers(stringWinningNumbers, stringBonusNumber);
            } catch (IllegalArgumentException e) {
                ExceptionOutputView.printErrorMessage(e.getMessage());
            }
        }
    }
}
