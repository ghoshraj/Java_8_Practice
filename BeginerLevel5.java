package Java_8;

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
