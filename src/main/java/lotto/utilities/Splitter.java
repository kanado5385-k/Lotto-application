package lotto.utilities;

import java.util.List;

public class Splitter {
    public static List<String> splitNumbers(String numbers){
        return List.of(numbers.split(","));
    }
}
