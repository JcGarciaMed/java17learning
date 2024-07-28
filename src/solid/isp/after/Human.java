package solid.isp.after;

public class Human implements Workable, Eatable{
    @Override
    public void eat() {
        System.out.println("Human eat");
    }

    @Override
    public void work() {
        System.out.println("Human work");
    }
}
