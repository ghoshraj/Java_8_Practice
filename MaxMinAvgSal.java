package Java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class worker{
    String name;
    double salary;

    public worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class MaxMinAvgSal {
    public static void main(String[] args) {
        worker w1 = new worker("raj",30000.00);
        worker w2 = new worker("ram",10000.00);
        worker w3 = new worker("rahul",40000.00);
        worker w4 = new worker("raja",20000.00);
        worker w5 = new worker("raban",3000.00);

        List<worker>list = Arrays.asList(w1,w2,w3,w4,w5);

        Optional<worker>max = list.stream().collect(Collectors.maxBy(Comparator.comparing(i->i.salary)));
        System.out.println(max.get().name + " : " + max.get().salary);
        System.out.println("__________________________________________");
        Optional<worker>min = list.stream().collect(Collectors.minBy(Comparator.comparing(i-> i.salary)));
        System.out.println(min.get().name + " : " + min.get().salary);
        System.out.println("_________________________________________");
        Double avgsal = list.stream().collect(Collectors.averagingDouble(i -> i.salary));
        System.out.println(avgsal);
    }
}
