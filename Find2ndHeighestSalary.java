package Java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Find2ndHeighestSalary {
    public static void main(String[] args) {
        List<Employe> emp = new ArrayList<>();
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

        //1st approach
        Optional<Employe>second = emp.stream().sorted(Comparator.comparing(Employe::getSalary).reversed())
                .skip(1).findFirst();
        if (second.isPresent())
            System.out.println(second.get().getName());

        //2nd approach
        List<Employe>s = emp.stream().sorted(Comparator.comparing(Employe::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(s.get(1).getName());
    }
}
