package Java_8;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<String>javacourse = Arrays.asList("Java","AdvJava","Framework");
        List<String>uicourses = Arrays.asList("Html","CSS","Bootstrap","JS");
        List<List<String>>course = Arrays.asList(javacourse,uicourses);

        course.stream().flatMap(strings -> strings.stream()).forEach(s -> System.out.println(s));
    }
}
