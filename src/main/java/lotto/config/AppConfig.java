package lotto.config;

import lotto.controller.LottoController;
import lotto.factory.DomainFactory;
import lotto.factory.ModelFactory;
import lotto.factory.ServiceFactory;
import lotto.factory.ViewFactory;

public class AppConfig {
    public LottoController lottoController() {
        DomainFactory domainFactory = new DomainFactory();
        ServiceFactory serviceFactory = new ServiceFactory();
        ModelFactory modelFactory = new ModelFactory();
        ViewFactory viewFactory = new ViewFactory();

        return new LottoController(domainFactory, serviceFactory, modelFactory, viewFactory);
    }
}
