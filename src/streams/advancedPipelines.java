package streams;

import java.util.ArrayList;

public class advancedPipelines {
    public static void main(String[] args) {
        var pets = new ArrayList<String>();
        pets.add("Perro");
        pets.add("Gato");
        var stream  = pets.stream();
        pets.add("Loro");
        System.out.println(stream.count());

    }
}
