package streamAPImethods;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfIterateGenerateExample {

    public static void main(String[] args) {

        Stream<String> stringStream=Stream.of("Adam","Jenny","Sophiya");
        stringStream.forEach(System.out::println);

        Stream.iterate(1,x->x*2)
                .limit(10)
                .forEach(System.out::println);
        Supplier<Integer> s1=new Random()::nextInt;
        Stream.generate(s1)
                .limit(5)
                .forEach(System.out::println);
    }
}
