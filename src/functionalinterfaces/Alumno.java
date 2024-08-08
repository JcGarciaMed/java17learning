package functionalinterfaces;

class Alumno{
    private int nota;
    private String nombre;
    private boolean habilitado;

    public Alumno(int nota, String nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }

    public Alumno(int nota, String nombre, boolean habilitado) {
        this.nota = nota;
        this.nombre = nombre;
        this.habilitado = habilitado;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nota=" + nota +
                ", nombre='" + nombre + '\'' +
                ", habilitado=" + habilitado +
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

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
