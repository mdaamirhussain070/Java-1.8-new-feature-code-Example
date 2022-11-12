package functionalinterface;

import java.util.Locale;
import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> f1=(name->name.toUpperCase());
    static Function<String,String> f2=(name)->name.toUpperCase().concat("Default");
    public static void main(String[] args) {

        System.out.println("Result: "+ f1.andThen(f2).apply("Java9"));
        System.out.println("Result : "+f1.apply("Java 8"));

        System.out.println(f1.compose(f2).apply("Java10"));

    }
}
