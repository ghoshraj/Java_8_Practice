package Java_8;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(10,20,12,13,14,11,15,17,18);
        list.stream().filter(i->i % 2 == 0).forEach(integer -> System.out.println(integer));
    }
}
