package solid.isp.before;

public class Robot implements Woker{
    @Override
    public void work() {
        System.out.println("Robot works");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot doesn't eat");
    }
}
