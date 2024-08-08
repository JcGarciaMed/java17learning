package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerClass {

    public static void main(String[] args) {
        List<Alumno> alumnos = Arrays.asList(
                new Alumno(20, "Juan"),
                new Alumno(18, "Carlos"),
                new Alumno(10, "Pedro"));

        Consumer<Alumno> c1  = (a) -> {
            a.setNota(14);
            System.out.println(a);
            System.out.println("-----");
        };

        c1.accept(new Alumno(20, "Juan"));
        imprimirListado(alumnos, c1);


        //METODOS

        Consumer<Alumno> actNota = a->a.setNota(a.getNota()+2);
        Consumer<Alumno> imprimir = a -> System.out.println(a);
        Consumer<Alumno> actNotaAndPrint = actNota.andThen(imprimir);
        System.out.println("---------ActNotaAndPrint -------");
        for (Alumno a : alumnos) {
            actNotaAndPrint.accept(a);
        }
    }

    public static void imprimirListado(List <Alumno> alumnos, Consumer<Alumno> consumer) {
        for (Alumno a : alumnos) {
            consumer.accept(a);
        }
    }

}