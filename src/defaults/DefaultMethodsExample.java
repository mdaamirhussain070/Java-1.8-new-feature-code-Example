package defaults;

import java.util.*;

public class DefaultMethodsExample {

    public static void main(String[] args) {
        // sort list name in alphabetic order
        List<String> stringList= Arrays.asList("Adam","Jenny","Sophiya","Alex","Mike","Eric");
        // Prior java 8
      //  Collections.sort(stringList);
        System.out.println(stringList);

        // java 8
     //   stringList.sort(Comparator.naturalOrder());
        System.out.println(stringList);
        stringList.sort(Comparator.reverseOrder());
        System.out.println(stringList);

    }
}
