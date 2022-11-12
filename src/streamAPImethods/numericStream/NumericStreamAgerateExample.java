package streamAPImethods.numericStream;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAgerateExample {
    public static void main(String[] args) {
        int sum=IntStream.rangeClosed(1,50).sum();
        System.out.println(sum);

        OptionalInt max=IntStream.rangeClosed(1,50).max();
        if(max.isPresent()){
            System.out.println(max.getAsInt());

        }
        OptionalInt min=IntStream.rangeClosed(1,50).min();
        if (min.isPresent()){
            System.out.println(min.getAsInt());
        }
        OptionalDouble average = IntStream.rangeClosed(1, 50).average();
        System.out.println(average.isPresent()?average.getAsDouble():0);
    }
}
