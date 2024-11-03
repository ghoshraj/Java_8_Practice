package Java_8;


import java.util.function.BiFunction;

public class Sum {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer>bo = (a,b)->a+b;
        int result = bo.apply(10,20);
        System.out.println(result);
    }
}
