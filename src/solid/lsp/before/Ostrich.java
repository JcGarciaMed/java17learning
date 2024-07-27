package solid.lsp.before;

public class Ostrich extends Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich cant fly.");
    }
}
