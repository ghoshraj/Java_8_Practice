package Java_8;

import java.util.Arrays;
import java.util.List;

public class SliceDemo {
    public static void main(String[] args) {
        List<String> javacourse = Arrays.asList("Java","Jdbc","Servlet","Jsp","Hibernate","Spring","SpringBoot");

        javacourse.stream().limit(3).forEach(s -> System.out.println(s));
        System.out.println("_____________________________________________");
        javacourse.stream().skip(3).forEach(s -> System.out.println(s));
    }
}
