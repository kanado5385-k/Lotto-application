package lotto.model;

import java.util.ArrayList;
import java.util.List;

public class Lottos {
    private final List<Lotto> lottos;

    public Lottos(Money money) {
        List<Lotto> lottos = new ArrayList<>();
        int lottosQuantity = money.getLottosQuantity();
        for (int i = 0; i < lottosQuantity; i++){
            lottos.add(new Lotto());
        }
        this.lottos = lottos;
    }
}
