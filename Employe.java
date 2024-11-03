package Java_8;

public class Employe {
    int id;
    String name;
    String gender;
    String Department;
    int age;
    int yearOfjoining;
    double salary;

    public Employe(int id, String name, String gender, String department, int age, int yearOfjoining, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        Department = department;
        this.age = age;
        this.yearOfjoining = yearOfjoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfjoining() {
        return yearOfjoining;
    }

    public void setYearOfjoining(int yearOfjoining) {
        this.yearOfjoining = yearOfjoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
