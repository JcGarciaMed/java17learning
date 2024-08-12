package referencemethods;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Penguin {
    public static void main(String[] args) {
        //Supplier<Integer> methodRef1 = () -> Penguin.countBabies();
        Supplier<Integer> methodRef1 = Penguin::countBabies;
        System.out.println(methodRef1.get());

        //Function<Penguin, Integer> methodRef2 = (a)-> Penguin.countBabies(a);
        Function<Penguin, Integer> methodRef2 = Penguin::countBabies;
        System.out.println(methodRef2.apply(new Penguin()));

        //BiFunction<Penguin, Penguin, Integer> methodRef3 = (a,b)->Penguin.countBabies(a,b);
        BiFunction<Penguin, Penguin, Integer> methodRef3 = Penguin::countBabies;
        System.out.println(methodRef3.apply(new Penguin(),new Penguin()));
    }
    public static Integer countBabies(Penguin... cuties){
        return cuties.length;
    }
}
