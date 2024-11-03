package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class person{
    String name;
    int age;
    person(String name ,int age){
       this.name = name;
       this.age = age;
    }
}

public class CheckAge {
    public static void main(String[] args) {
       person p1 = new person("raj",22);
       person p2 = new person("subha",25);
       person p3 = new person("subhasis" ,26);
       person p4 = new person("Kamol" ,27);
       List<person> p = Arrays.asList(p1,p2,p3,p4);

        Predicate<person>per = pe -> pe.age > 25;
        for (person person : p){
            if (per.test(person))
                System.out.println(person.name);
        }
    }
}
