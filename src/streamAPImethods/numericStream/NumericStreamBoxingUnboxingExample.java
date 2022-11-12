package streamAPImethods.numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());
    }
    public static int unboxing(List<Integer> integerList){
        return integerList.stream()
                .mapToInt(Integer::intValue)
               .sum();

    }
    public static void main(String[] args) {
        System.out.println("Boxing"+boxing()); //Premitive to Wapper
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        System.out.println("Unboxing : "+unboxing(list));
    }
}
