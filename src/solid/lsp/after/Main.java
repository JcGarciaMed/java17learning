package solid.lsp.after;

public class Main {
    public static void main(String[] args) {
        Bird bird = new FlyingBird();
        Ostrich ostrich = new Ostrich();

        move(bird);
        move(ostrich);

    }

    public static void move(Bird bird){
        bird.move();
    }
}
