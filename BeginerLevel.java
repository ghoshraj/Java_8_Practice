package Java_8;

@FunctionalInterface
interface Printer{
   void printMessage(String message);
}
public class BeginerLevel {
    public static void main(String[] args) {
        Printer p = (name -> System.out.println("Message : " + "[" + name + "]"));
        p.printMessage("Raj");
    }
}
