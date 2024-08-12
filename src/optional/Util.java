package optional;

import java.util.Optional;

public class Util {
    public static Optional<Double> promedio(int...score){
        if (score.length == 0) return Optional.empty();
        int sum = 0;
        for (int i : score) {
            sum += i;
        }
        return Optional.of((double) sum / score.length);
    }
}
