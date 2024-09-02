package streams;

import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        System.out.println("----Filter------");
        Stream<String> pets = Stream.of("gato", "perro", "gallina", "gato", "loro");
        pets.filter(p -> p.startsWith("g")).forEach(System.out::println);

        System.out.println("----Disctinct------");
        pets = Stream.of("gato", "perro", "gallina", "gato", "loro");
        pets.distinct().forEach(p -> System.out.println(p));

        System.out.println("----Skip---Limit-----");
        Stream<Integer> infinite = Stream.iterate(8, n-> n*n);
        infinite
                .distinct()
                .skip(2)
                .limit(3)
                .forEach(solution -> System.out.println(solution));

        System.out.println("----Map-----");
        Stream<String> mascotas = Stream.of("Gato", "Perro", "Delfin", "loto");
        mascotas
                .map(a->a.length())
                //.map(a->new Object())
                //.filter(a-> a.equals(""))
                .forEach(System.out::println);

        System.out.println("----FlatMap-----");
        List<String> zero = List.of();
        var one = List.of("Jorge");
        var Two = List.of("Karina", "JJGARCIA");
        var three = List.of(122, 9988);

        Stream<List<String>> nombres = Stream.of(zero, one, Two);
        nombres.forEach(System.out::println);

        nombres = Stream.of(zero, one, Two);
        nombres.flatMap(m->m.stream())
                //.map(m->m.length())
                //.distinct()
                //.peek(x-> System.out.println("before: " + x))
                //.filter(a->a>5)
                //.peek(x-> System.out.println("after: " + x))
                //.limit(1)
                .forEach(System.out::println);

    }
}
