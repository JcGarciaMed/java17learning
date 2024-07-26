package solid.ocp.after;

public class Circle implements Shape {
    private double radius;
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
