package functionalintefaces;

class Alumno{
    private int nota;
    private String nombre;

    public Alumno(int nota, String nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nota=" + nota +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public int getNota() {
        return nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
