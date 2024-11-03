package Java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class staff{
    String name;
    double basesalary;
    Optional<String>role;

    public staff(String name, double basesalary, Optional<String> role) {
        this.name = name;
        this.basesalary = basesalary;
        this.role = role;
    }
}
public class StaffDriver {
    public static void main(String[] args) {
        List<staff> staffList = new ArrayList<>();

        staffList.add(new staff("Alice", 50000, Optional.of("Manager")));
        staffList.add(new staff("Bob", 45000, Optional.of("Developer")));
        staffList.add(new staff("Carol", 48000, Optional.of("Analyst")));
        staffList.add(new staff("David", 52000, Optional.empty()));
        staffList.add(new staff("Eve", 47000, Optional.of("Developer")));
        staffList.add(new staff("Frank", 60000, Optional.of("Lead")));
        staffList.add(new staff("Grace", 55000, Optional.of("Manager")));
        staffList.add(new staff("Heidi", 51000, Optional.of("Developer")));
        staffList.add(new staff("Ivan", 53000, Optional.of("Analyst")));
        staffList.add(new staff("Judy", 49000, Optional.empty()));

       List<staff>st = staffList.stream().filter(i -> i.role.isPresent()).map(staff ->new staff(
               staff.name,staff.basesalary*1.2,staff.role)).collect(Collectors.toList());
       st.forEach(staff -> System.out.println(staff.name + " " + staff.role + " " + staff.basesalary));
    }
}
