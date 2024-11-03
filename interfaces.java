package Java_8;

interface vehicle{
     void start();
     default void clean(){
         System.out.println("clean complete");
     }
}
public class interfaces implements vehicle{
    public static void main(String[] args) {
            interfaces im = new interfaces();
            im.start();
            im.clean();
    }

    @Override
    public void start() {
        System.out.println("car started");
    }
}
