package streamAPImethods.numericStream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {
    public static void main(String[] args) {
        IntStream intStream=IntStream.range(1,50);
        System.out.println(intStream.count());
     //   intStream.forEach(System.out::println);
   //     long num=intStream.count();
    //    System.out.println(num);
        IntStream.range(1,51).forEach((value -> System.out.println(value+",")));
        System.out.println("Range close count"+IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,51).forEach((value -> System.out.println(value+",")));

        System.out.println("Long Range count "+LongStream.range(1,50).count());
        LongStream.range(1,50).forEach(value -> System.out.println("Long Stram value "+value));

        System.out.println("Long Range Close Count"+LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(value -> System.out.println(value));

        System.out.println(LongStream.range(1,50).asDoubleStream().count());
        LongStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.println(value));

    }
}
