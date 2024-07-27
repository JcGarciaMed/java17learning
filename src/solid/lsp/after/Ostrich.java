package solid.lsp.after;

public class Ostrich extends Bird {
    @Override
    public void move() {
        walk();
    }

    private void walk() {
        System.out.printf("walking\n");
    }
}
