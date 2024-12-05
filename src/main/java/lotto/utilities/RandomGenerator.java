package lotto.utilities;

import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomGenerator {
    public static List<Integer> lottoGenerator() {
        List<Integer> randomNumber =
            Randoms.pickUniqueNumbersInRange(
            1,
            45,
            6);
    return randomNumber;
  }
}
