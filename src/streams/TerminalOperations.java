package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("gorilla", "monkey", "bonobo");
        s.forEach(System.out::println);

        System.out.println("---min max------");
        s = Stream.of("gato", "leon", "mono");
        s.min(String::compareTo).ifPresent(System.out::println);

        s = Stream.of("gato", "leon", "mono");
        s.max(String::compareTo).ifPresent(System.out::println);

        System.out.println("---count------");
        s = Stream.of("gato", "leon", "mono");
        long conteo = s.count();
        System.out.println(conteo);


        System.out.println("---findAny--Findfirst------");
        s = Stream.of("gato", "leon", "mono");
        s.findAny().ifPresent(System.out::println);

        s = Stream.of("gato", "leon", "mono");
        s.findFirst().ifPresent(System.out::println);

        Stream<String> infinite = Stream.generate(()->"Hello");
        infinite.findAny().ifPresent(System.out::println);

        System.out.println("---any--all--none---match");
        List<String> list = List.of("gato", "gorilla", "monkey");
        Predicate<String> predicate = x -> x.length() > 6;
        System.out.println(list.stream().anyMatch(predicate));
        System.out.println(list.stream().allMatch(predicate));
        System.out.println(list.stream().noneMatch(predicate));

        list.stream().forEach(System.out::println);

        System.out.println("-----REDUCE-------");
        String value = list.stream().reduce("animals:", (a,b)->a.concat(b));
        System.out.println(value);

        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> fourElement = Stream.of(3,5,6,7);
        Stream<Integer> emptyStream = Stream.empty();
        Stream<Integer> twoElement = Stream.of(4,2);

        System.out.println("-----REDUCE Two Element-------");
        System.out.println(twoElement.reduce(10,(a,b)->a*b));

        System.out.println("-----REDUCE empty-------");
        emptyStream.reduce((a,b)->a*b).ifPresent(System.out::println);
        System.out.println("-----REDUCE One Element-------");
        oneElement.reduce((a,b)->a+b).ifPresent(System.out::println);
        System.out.println("-----REDUCE Four Element-------");
        Integer number= fourElement.reduce(5,(a,b)->a+b);
        System.out.println(number);

        int tamaño = list.stream().reduce(5, (a,b)->a+b.length(), (c,d)->c+d);
        System.out.println(tamaño);

        int tamanio2= list.parallelStream().reduce(5, (a,b)->a+b.length(), (c,d)->c+d);
        System.out.println(tamanio2);


    }

}
