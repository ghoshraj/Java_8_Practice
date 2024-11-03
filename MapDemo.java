package Java_8;

import java.util.Arrays;
import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("raj","deba","gaurav","subhasish");
        list.stream().map(name -> name.toUpperCase()).forEach(s -> System.out.println(s));
    }
}
