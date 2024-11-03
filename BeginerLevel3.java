package Java_8;

import java.util.Optional;

public class BeginerLevel3 {
    public static void main(String[] args) {
        Optional<Integer>integer = Optional.of(5);
        System.out.println(integer.map(value -> value * value).orElseGet(() ->{
            System.out.println("Not found");
            return null;
        }));
    }
}
