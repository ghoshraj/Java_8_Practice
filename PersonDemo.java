package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class persons{
    String name;
    String country;

    public persons(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
public class PersonDemo {
    public static void main(String[] args) {
        persons p1 = new persons("Raj","INDIA");
        persons p2 = new persons("chinanu","CHINA");
        persons p3 = new persons("Bili","UK");
        persons p4 = new persons("Subhasis","INDIA");

        List<persons>persons = Arrays.asList(p1,p2,p3,p4);

        List<persons>indians = persons.stream().filter(p->p.country.equals("INDIA")).collect(Collectors.toList());
        indians.forEach(i-> System.out.println(i));

    }
}
