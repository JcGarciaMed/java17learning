package optional;

import java.util.Optional;


public class OptionalChain {

    public static void main(String[] args) {
        Optional<Integer> opt = Optional.of(253);
        threeDigit(opt);

        opt.map(e->calculate2(e)).ifPresent(System.out::println);
        opt.flatMap(e->calculate(e)).ifPresent(System.out::println);
    }


    private static void threeDigit(Optional<Integer> optional){
        optional.map(n->""+n)
                .filter(s->s.length()==3)
                .ifPresent(System.out::println);
    }

    private static Optional<Integer> calculate(Integer val){
        return Optional.of(val*2);
    }

    private static Integer calculate2(Integer val){
        return val*2;
    }

}
