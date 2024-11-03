package Java_8;

public class Thread {
    public static void main(String[] args) {
        Runnable r = ()->{
            for (int i = 1; i <=5; i++){
                System.out.println(i);
            }
        };
        java.lang.Thread thread = new java.lang.Thread(r);
        thread.start();
    }
}
