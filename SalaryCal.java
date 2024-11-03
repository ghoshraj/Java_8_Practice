package Java_8;

import java.util.Arrays;
import java.util.List;

public class SalaryCal {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1000000,2000,30000,4000000,50000,3000);
        list.stream().filter(i-> i > 500000).forEach(integer -> System.out.println(integer));
    }
}
