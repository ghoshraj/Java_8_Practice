package Java_8;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(10,11,12,13,14,15,16);
        int sum = list.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
