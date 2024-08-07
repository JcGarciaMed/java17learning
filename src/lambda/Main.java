package lambda;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Reporter.printReport(()->System.out.println("Printing Template A"));
        Reporter.printReport(()->System.out.println("Printing Template B"));

        String doi = "1223233";

        Integer id = Reporter.getPrinterId(o-> Integer.valueOf(o +"002"), doi);
        Integer id2 = Reporter.getPrinterId(o-> returnInt(), doi);
        System.out.println(id);
        System.out.println(id2);

        Integer space = 123;
        Integer time = 923;
        Integer speed = Reporter.flyingSpeed((e,t)->e*t,space,time);
        System.out.println("This is the speed: " + speed);

    }

    public static Integer returnInt(){
        return new Random().nextInt();
    }
}
