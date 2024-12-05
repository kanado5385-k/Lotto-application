package lotto.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import lotto.factory.ModelFactory;

public class Lottos {
    private final List<Lotto> lottos;

    public Lottos(Money money, ModelFactory modelFactory) {
        int lottosQuantity = money.getLottosQuantity();
        this.lottos = IntStream.range(0, lottosQuantity)
                       .mapToObj(i -> modelFactory.createLotto())
                       .collect(Collectors.toList());
    }

    public List<Lotto> getLottos() {
        return lottos;
    }


}
