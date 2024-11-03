package Java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeDriver1 {
    public static void main(String[] args) {
        Employe e1 = new Employe(1,"raj","Male","Developer",22,2024,300000);
        Employe e2 = new Employe(2,"ram","Male","Consultant",20,2026,200000);
        Employe e3 = new Employe(3,"riya","fe-Male","Cooking",21,2024,250000);
        Employe e4 = new Employe(4,"ankita","fe-Male","Developer",22,2024,300000);
        Employe e5 = new Employe(5,"subhasis","Male","Developer",24,2024,350000);
        Employe e6 = new Employe(6,"arun","Male","Developer",25,2020,1300000);
        Employe e7 = new Employe(7,"deva","Male","Developer",25,2024,350000);
        Employe e8 = new Employe(8,"nibedita","fe-Male","Developer",22,2024,300000);
        Employe e9 = new Employe(9,"suroj","Male","Testing",23,2025,210000);
        Employe e10 = new Employe(10,"rahul","Male","Testing",23,2025,220000);


        List<Employe>employeList = Arrays.asList(e7,e6,e8,e2,e3,e4,e5,e10,e1,e9);

        //total male emp
        int mcount = (int) employeList.stream().filter(i-> i.getGender().equals("Male")).count();
        System.out.println("Total male : " + mcount);

        //total female emp
        int fcount = (int) employeList.stream().filter(i-> i.getGender().equals("fe-Male")).count();
        System.out.println("Total female : " + fcount);

        //all the deptname
        employeList.stream().map(i -> i.getDepartment()).distinct().forEach(i-> System.out.println(i));

    }
}
