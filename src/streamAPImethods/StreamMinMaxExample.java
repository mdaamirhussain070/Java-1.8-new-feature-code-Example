package streamAPImethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream()
                //6->b
                //7->b
                //8->b
                //9->b
                //10->b
                //a variable holds max value for each iteration
         //       .reduce(0,(a,b)->a>b?a:b);
                .reduce(0,Integer::max);
    }
    public static Optional<Integer> findMaxValueWithOptional(List<Integer> integerList){
        return integerList.stream()
                //6->b
                //7->b
                //8->b
                //9->b
                //10->b
                //a variable holds max value for each iteration
                //       .reduce((a,b)->a>b?a:b);
                .reduce(Integer::max);
    }
    public static Optional<Integer> findMinValue(List<Integer> integerList){
        return integerList.stream()
                //6->b
                //7->b
                //8->b
                //9->b
                //10->b
                //a variable holds max value for each iteration
                //       .reduce((a,b)->a<b?a:b);
                .reduce(Integer::min);
    }
    public static void main(String[] args) {
        List<Integer>  integerList= Arrays.asList(6,7,8,9,10);
        List<Integer> integersEmplty=Arrays.asList();
      //  System.out.println(findMaxValue(integerList));

        Optional<Integer> maxvalue=findMaxValueWithOptional(integerList);
        System.out.println(maxvalue);
        if(maxvalue.isPresent()){
            System.out.println("Max Value is : "+maxvalue.get());
        }else {
            System.out.println("No Max Value");
        }
        Optional<Integer> minValue=findMinValue(integerList);
        if(minValue.isPresent()){
            System.out.println("Min Value : "+minValue.get());
        }else {
            System.out.println("No Min Value");
        }
    }
}
