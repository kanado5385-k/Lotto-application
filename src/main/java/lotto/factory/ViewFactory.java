package lotto.factory;

import lotto.view.InputView;
import lotto.view.OutputView;

public class ViewFactory {

    public InputView createInputView() {
        return new InputView();
    }

    public OutputView createOutputView() {
        return new OutputView();
    }
}