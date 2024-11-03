package Java_8;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSorting {
    public static void main(String[] args) {
        ArrayList<Integer>ai = new ArrayList<>();
        ai.add(10);
        ai.add(70);
        ai.add(60);
        ai.add(40);
        ai.add(50);
        Collections.sort(ai,(i,j)-> (i > j) ? -1 : 1);
        System.out.println(ai);
    }
}
