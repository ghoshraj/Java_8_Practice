package Java_8;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("-");
        joiner.add("Java");
        joiner.add("Full");
        joiner.add("Stack");
        System.out.println(joiner);
    }
}
