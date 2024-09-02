package streams;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
record Animal(String nombre, String raza){};
public class Grouping {
    public static void main(String[] args) {

        Animal animal = new Animal("Perro", "canino");
        Animal animal2 = new Animal("Pato", "ave");
        Animal animal3 = new Animal("Halcon", "ave");
        Animal animal4 = new Animal("Gato", "felino");

        var animals = Stream.of(animal, animal2, animal3, animal4);
        Map<String, List<Animal>> animalMap = animals.collect(Collectors.groupingBy(a->a.raza()));
        System.out.println(animalMap);

        System.out.println("-----GroupingBy-----");
        var pets = Stream.of("loro", "gato", "perro");
        Map<Integer, List<String>> mapResult = pets.collect(Collectors.groupingBy(a->a.length()));
        System.out.println(mapResult);

        System.out.println("-----PartitioningBy-----");
        var pets2 = Stream.of("loro", "gato", "perro");
        Map<Boolean, List<String>> mapResult2 = pets2.collect(Collectors.partitioningBy(a->a.length()<5));
        System.out.println(mapResult2);
    }
}
