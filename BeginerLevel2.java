package Java_8;

import java.util.Optional;

public class BeginerLevel2 {
    public static void main(String[] args) {
        Optional<String>s = Optional.of("Hello World");
      s.ifPresent(value -> System.out.println(value.toUpperCase()));
    }
}
