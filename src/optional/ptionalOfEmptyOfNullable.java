package optional;

import java.util.Optional;

public class ptionalOfEmptyOfNullable {
    public static Optional<String> ofNullableExample(){
        Optional<String> stringOptional=Optional.ofNullable("Hello");
     //   Optional<String> stringOptional=Optional.ofNullable(null);
        return stringOptional;
    }

    public static Optional<String> ofExample(){
        Optional<String> stringOptional=Optional.of("Hello");
    //    Optional<String> stringOptional=Optional.of(null);
        return stringOptional;
    }
    public static Optional<String> emptyExample(){

        return Optional.empty();
    }
    public static void main(String[] args) {
        System.out.println(ofNullableExample().get());
        System.out.println(ofExample().get());
        System.out.println(emptyExample());
    }
}
