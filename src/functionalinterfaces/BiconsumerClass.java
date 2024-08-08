package functionalinterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiconsumerClass {
    public static void main(String[] args) {
        var map = new HashMap<String, String>();
        BiConsumer<String, String> biConsumer1 = (k, v) -> System.out.println("Doing Something without parameters");
        biConsumer1.accept("Something", "Anything");
        Map<String, ? super String> map2 = new HashMap<>();
        BiConsumer<String, ? super String> biConsumer = (k, v) -> map2.put(k, v);
        biConsumer.accept("cod1", "Jorge");
        biConsumer.accept("cod2", "Carlos");
        biConsumer.accept("cod3", "Garcia");
        System.out.println(map2);
    }
}
