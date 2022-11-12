package streamAPImethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimtSkipExample {
    public static Optional<Integer> limit(List<Integer> integerList){
        return integerList.stream()
                .limit(3)
                .reduce((x,y)->x+y);
    }
    public static Optional<Integer> skip(List<Integer> integerList){
        return integerList.stream()
                .skip(3)
                .reduce((x,y)->x+y);
    }


    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(6,7,8,9,10);
//        Optional<Integer> result=limit(integerList);
//        if(result.isPresent()){
//            System.out.println("Limit Result = "+result.get());
//        }else {
//            System.out.println("Not REsult");
//        }
        Optional<Integer> result=skip(integerList);
        if(result.isPresent()){
            System.out.println("Skip Result "+result.get());
        }else {
            System.out.println("No Result");
        }
    }
}
