package methodrefrence;

import java.util.function.Function;

public class FunctionMethodeference {
    static Function<String,String> function=(s)->s.toUpperCase();
    static Function<String,String> functiionMethodReference= String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(function.apply("Java8"));
        System.out.println(functiionMethodReference.apply("Java9"));
    }
}
