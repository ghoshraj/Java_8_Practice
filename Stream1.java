package Java_8;

import java.util.Arrays;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,30,50,60,10);
        list.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));
    }
}
