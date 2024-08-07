package lambda;

public interface Generator {
    Integer generateId(String doi);
    default Integer generateAnotherCode(){
        return null;
    };
}
