package lotto.factory;

import lotto.service.LottoService;

public class ServiceFactory {
    public LottoService createLottoService() {
        return new LottoService();
    }
}
