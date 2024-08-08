package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierClass {
    public static void main(String[] args) {
        List<Alumno> alumnos = Arrays.asList(
                new Alumno(20, "Juan"),
                new Alumno(18, "Carlos"),
                new Alumno(10, "Pedro"));

        Supplier<Alumno> s2 = () -> new Alumno(15, "Jorge");
        System.out.println(getAlumno(s2));

        Supplier<Alumno> s3 = () -> {
            alumnos.get(0).setNota(12);
            return alumnos.get(0);
        };
        System.out.println(s3.get());
    }

    public static Alumno getAlumno(Supplier<Alumno> s){
        return s.get();
    }
}
