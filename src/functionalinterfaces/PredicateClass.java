package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateClass {
    public static void main(String[] args) {
        List<Alumno> alumnos = Arrays.asList(
                new Alumno(20, "Juan"),
                new Alumno(18, "Carlos"),
                new Alumno(10, "Pedro"));

        Predicate<Alumno> p1 = a-> a.getNota()>10;
        Predicate<Alumno> p2 = a-> a.getNombre().startsWith("J");
        Predicate<Alumno> p3 = a-> a.getNombre().length() > 5;

        System.out.println("    FILTRO 1    ");
        imprimirDetalle(alumnos, p1);
        System.out.println("    FILTRO 2    ");
        imprimirDetalle(alumnos, p2);
        System.out.println("    FILTRO 3    ");
        imprimirDetalle(alumnos, p3);

        BiPredicate<Alumno, Integer> bp1 = (a, i) -> a.getNota()+i > 11;
        System.out.println("    FILTRO 4    ");
        imprimirDetalle2(alumnos, bp1);


    }
    public static void imprimirDetalle(List<Alumno> alumnos, Predicate<Alumno> p) {
        for (Alumno alumno : alumnos) {
            if (p.test(alumno)) {
                System.out.println(alumno);
            }
        }
    }
    public static void imprimirDetalle2(List<Alumno> alumnos, BiPredicate<Alumno, Integer> bp){
        Integer incremento = 3;
        for (Alumno alumno : alumnos) {
            if (bp.test(alumno, incremento)) {
                System.out.println(alumno);
            }
        }
    }
}