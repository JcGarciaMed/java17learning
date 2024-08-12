package optional;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        System.out.println(Util.promedio(20,18,17,12));
        System.out.println(Util.promedio());

        Optional<Double> opt1 = Util.promedio(20,18,17,12);
        if (opt1.isPresent()) {
            System.out.println(opt1.get());
        }

        Optional<Double> opt2 = Util.promedio();
        if (opt2.isPresent()) {
            System.out.println(opt2.get());
        }else {
            System.out.println("No value present");
        }
    }

}
