package Java_8;

public class LamdaDemo {
    public static void main(String[] args) {
        myinterface m = () -> System.out.println("m1 method called");
        m.m1();
    }

    @FunctionalInterface
    public static interface myinterface {
      void m1();
    }
}
