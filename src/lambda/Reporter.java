package lambda;

public class Reporter {
    public static void printReport(Template template){
        template.print();
    }
    public static Integer getPrinterId(Generator generator, String doi){return generator.generateId(doi);}

    public static Integer flyingSpeed(Flyable flyable, Integer space, Integer time){
        return flyable.speed(space, time);
    }
}
