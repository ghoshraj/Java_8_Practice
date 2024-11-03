package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface im{
    void name(String str);
}

public class BeginerLevel5 {
    public static void main(String[] args) {
       String s = "Java";
       String s1 = "I am a good java developer";
       String search = "ja";
       if (s1.toLowerCase().contains(search.toLowerCase()))
           System.out.println("present");
    }
}
