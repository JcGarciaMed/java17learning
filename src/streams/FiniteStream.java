package streams;

import java.util.List;
import java.util.stream.Stream;

public class FiniteStream {
    public static void main(String[] args) {
        System.out.println("----Finite Stream------");
        Stream<String> empty = Stream.empty();

        Stream<Integer> one = Stream.of(1);
        one.forEach(System.out::println);
        Stream<Integer> fromArray = Stream.of(1, 2, 3);
        fromArray.forEach(System.out::println);

        var list = List.of("a", "b", "c");
        list.forEach(System.out::println);

        System.out.println("----Parallel Stream------");
        Stream<String> fromListparallel = list.parallelStream();
        fromListparallel.forEach(System.out::println);
        System.out.println("----inFinite Stream------");
        Stream<Integer> oddNumberUnder200 = Stream.iterate(1,n->n>0, n -> n+2);
        oddNumberUnder200.forEach(System.out::println);
    }
}
