package optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalMethodClass {
    public static void main(String[] args) {
        Optional<Double> opt1 = Util.promedio(20,18,17,12);
        Optional<Double> opt2 = Util.promedio();

        System.out.println("----ifPresent----");
        opt1.ifPresent((object) -> System.out.println(object));
        opt2.ifPresent((object) -> System.out.println(object));

        System.out.println("----isPresent Get----");
        if(opt1.isPresent())
            System.out.println(opt1.get());

        System.out.println("----orElse----");
        System.out.println(opt1.orElse(20.50));
        System.out.println(opt2.orElse(21.50));

        System.out.println("----orElseThrow----");
        Double result = opt1.orElseThrow(()->new RuntimeException());
        System.out.println(result);
        try {
            try {
                opt2.orElseThrow();
            }catch (NoSuchElementException ex){
                opt2.orElseThrow(()->new ArithmeticException());
            }
        }catch (Exception e){
            System.out.println("Catch = " + e.getClass());
        }

        System.out.println("----ofNullable----");
        Optional<Double> opt3 = Optional.ofNullable(null);

        Double result2 = opt3.orElseThrow(()->new RuntimeException());
        System.out.println(result2);




    }
}
