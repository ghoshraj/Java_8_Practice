package Java_8;

import java.util.Arrays;
import java.util.List;

public class BeginerLevel4 {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(10,20,30,40,21,22,11,12,14,18,31,32);
        list.stream().filter(i -> i % 2 == 0).sorted((i,j) -> (i > j) ? -1 : 1).forEach(i -> System.out.println(i));
    }
}
