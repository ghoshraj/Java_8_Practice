package Java_8;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("raj","deba","gaurav","subhasish");
        list.stream().filter(name -> name.startsWith("r")).map(value ->value + " = " + value.length())
                .forEach(value -> System.out.println(value));
    }
}
