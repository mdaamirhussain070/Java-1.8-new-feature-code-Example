package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    static Consumer<List<String>> consum=(nameList)->{
        nameList.forEach(s -> System.out.println(s));
        System.out.println("filtered data Start with S");
        nameList.forEach((s -> {
            if(s.startsWith("S")){
                System.out.println(s);
            }
        }));
        System.out.println("filtered data end with man");
        nameList.forEach(n->{
            if(n.endsWith("man")){
                System.out.println(n);
            }
        });
        System.out.println("filtered data end with to upper case");
        nameList.forEach(n->{
                System.out.println(n.toUpperCase());

        });

    };
     //   nameList.forEach(name-> System.out.println(name));
    public static void dotask(List<String> nameList){
        System.out.println("Print name");
        consum.accept(nameList);
    }

    public static void main(String[] args) {

        List<String> namList= List.of("Ironman","Superman","Shaktiman","Hulk","Antman","Hanuman","Spiderman");
        dotask(namList);
    }

}
