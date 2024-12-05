package lotto.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lottos {
    private final List<Lotto> lottos;

    public Lottos(Money money) {
        int lottosQuantity = money.getLottosQuantity();
        this.lottos = IntStream.range(0, lottosQuantity)
                       .mapToObj(i -> new Lotto())
                       .collect(Collectors.toList());
    }

    public List<Lotto> getLottos() {
        return lottos;
    }


}
