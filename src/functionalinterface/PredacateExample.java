package functionalinterface;

import java.util.function.Predicate;

public class PredacateExample {
    static Predicate<Integer> p=(t)->{return t%2==0;};
    static Predicate<Integer> p2=(t)->{return t%5==0;};
    public static void main(String[] args) {


        System.out.println(   p.test(10));

        System.out.println(p.and(p2));
    }
}
