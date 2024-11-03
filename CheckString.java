package Java_8;

import java.util.function.Predicate;

public class CheckString {
    public static void main(String[] args) {
        String []arr = {"Rajesh", "Subhasis" , "Subha" , "Surojit"};
       Predicate<String>p = name -> name.charAt(0) == 'S';
       for (String name : arr){
          if(p.test(name))
           System.out.println(name);
       }
    }
}
