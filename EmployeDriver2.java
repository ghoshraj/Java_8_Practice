package Java_8;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeDriver2 {
    public static void main(String[] args) {
        List<Employe>emp = new ArrayList<>();
        emp.add(new Employe(1,"raj","Male","Developer",22,2024,300000));
        emp.add(new Employe(2,"ram","Male","Consultant",20,2026,200000));
        emp.add(new Employe(3,"riya","fe-Male","Cooking",21,2024,250000));
        emp.add(new Employe(4,"ankita","fe-Male","Developer",22,2024,300000));
        emp.add(new Employe(5,"subhasis","Male","Developer",24,2024,350000));
        emp.add(new Employe(6,"arun","Male","Developer",25,2020,1300000));
        emp.add(new Employe(7,"deva","Male","Developer",25,2024,350000));
        emp.add(new Employe(8,"nibedita","fe-Male","Developer",22,2024,300000));
        emp.add(new Employe(9,"suroj","Male","Testing",23,2025,210000));
        emp.add( new Employe(10,"rahul","Male","Testing",23,2025,220000));

        //average age of male and female
        Map<String, Double> avgage =emp.stream()
                        .collect(Collectors.groupingBy(Employe :: getGender,Collectors.averagingInt(Employe::getAge)));
        System.out.println("average age of male and female emp is : "+ avgage);

        //heighest paid emp
        Optional<Employe>highestsal = emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employe ::getSalary)));
        if (highestsal.isPresent())
            System.out.println("heighest paid emp is : "+highestsal.get().name);

        //who joined after 2024
        emp.stream().filter(i -> i.getYearOfjoining()>2024).forEach(i -> System.out.println(i.getName()));

        //count bases on dept
        Map<String, Long> dept = emp.stream().collect(Collectors.groupingBy(Employe ::getDepartment,Collectors.counting()));
        System.out.println("count bases on dept :"+dept);

        //average salary of each department
        Map<String,Double>dept1 = emp.stream().collect(Collectors
                .groupingBy(Employe::getDepartment,Collectors.averagingDouble(Employe::getSalary)));
        System.out.println(dept1);

        //youngest emp details in devloper dept
         Optional<Employe> e= emp.stream().filter(i -> i.getDepartment().equals("Developer") && i.getGender().equals("Male"))
                .min(Comparator.comparing(Employe::getAge));
         if (e.isPresent())
             System.out.println(e.get().getName());

        //most working experience
       Optional<Employe>s= emp.stream().min(Comparator.comparing(Employe::getYearOfjoining));
        System.out.println(s.get().getName());

        //total male and female in developer team
       Map<String,Long>m = emp.stream().filter(i -> i.getDepartment().equals("Developer"))
                .collect(Collectors.groupingBy(Employe::getGender,Collectors.counting()));
        System.out.println(m);

        //average salary of male and female
        Map<String,Double>map = emp.stream().collect(Collectors.groupingBy(Employe::getGender ,Collectors.averagingDouble(Employe::getSalary)));
        System.out.println(map);
    }
}
