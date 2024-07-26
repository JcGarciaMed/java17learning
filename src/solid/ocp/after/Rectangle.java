package solid.ocp.after;

public class Rectangle implements Shape {
    private double width;
    private double height;
    public double calculateArea() {
        return width * height;
    }
}
