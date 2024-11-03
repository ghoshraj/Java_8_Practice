package Java_8;

import java.util.ArrayList;
import java.util.Collections;

public class SortArraylist {
    public static void main(String[] args) {
        ArrayList<Integer>a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(5);
        a.add(4);
        a.add(8);
        Collections.sort(a,(i , j)->(i > j) ? -1 : 1);
        System.out.println(a);
    }
}
