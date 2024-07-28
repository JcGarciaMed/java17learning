package solid.isp.before;

public class Human implements Woker{
    @Override
    public void work() {
        System.out.println("Human works");
    }

    @Override
    public void eat() {
        System.out.println("Human eats");
    }
}
