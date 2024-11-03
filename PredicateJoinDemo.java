package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class emp{
    String name;
     String loc;
    String dept;

    emp(String n ,String l, String d){
        name = n;
        loc = l;
        dept = d;
    }
}
public class PredicateJoinDemo {
    public static void main(String[] args) {
       emp e1 = new emp("Raj","bengalore","devloper");
       emp e2 = new emp("Rahul","bengalore","testing");
       emp e3 = new emp("Subhasis","bengalore","devloper");
       emp e4 = new emp("Deba","bengalore","frontend");
       emp e5 = new emp("piysh","bengalore","frontend");

        List<emp> emp = Arrays.asList(e1,e2,e3,e4,e5);

        Predicate<emp> p1 = e -> e.loc.equals("bengalore");
        Predicate<emp> p2 = e -> e.dept.equals("devloper");
        Predicate<emp>p3 = e -> e.name.startsWith("R");

        Predicate<emp>p = p1.and(p2).and(p3);

        for (emp e : emp){
            if (p.test(e))
                System.out.println(e.name);
        }
    }
}
