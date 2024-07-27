package solid.lsp.after;

public class FlyingBird extends Bird {
    @Override
    public void move() {
        fly();
    }

    private void fly() {
        System.out.printf("FlyingBird.fly()\n");
    }
}
