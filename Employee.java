package Java_8;

import java.util.stream.Stream;

class emps{
    String name;
    int age;
    double salary;

    public emps(String name, int age , double salary){
        if (age <= 18)
            throw new IndexOutOfBoundsException();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 18)
            throw new IndexOutOfBoundsException();
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class Employee {
    public static void main(String[] args) {
        emps e1 = new emps("raj",22,40000.00);
        emps e2 = new emps("arun",26,140000.00);
        emps e3 = new emps("subhasis",24,35000.00);
        emps e4 = new emps("nibedita",22,30000.00);
        emps e5 = new emps("ankita",22,30000.00);

        Stream<emps>empsStream = Stream.of(e1,e2,e3,e4,e5);
        empsStream.filter(i -> i.getSalary()>30000.00).map(details -> details.getName() + " : " + details.getAge())
                .forEach(s -> System.out.println(s));
    }
}
