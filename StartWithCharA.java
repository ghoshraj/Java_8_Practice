package Java_8;

import java.util.Arrays;
import java.util.List;

public class StartWithCharA {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("Rajesh" ,"Subhasis" ,"Ankita" ,"Amit");
        list.stream().filter(i -> i.startsWith("A")).forEach(s -> System.out.println(s));
    }
}
