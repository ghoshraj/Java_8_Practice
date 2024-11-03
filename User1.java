package Java_8;

import java.util.stream.Stream;

class users{
    String name;
    int age;

    public users(String name , int age){
        if (age <= 20)
            throw new IndexOutOfBoundsException();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "users[name=" + name + ",age = " + age + "]";
    }
}
public class User1 {
    public static void main(String[] args) {
        users u1 = new users("raj",22);
        users u2 = new users("deba",25);
        users u3 = new users("subhasis",24);
        users u4 = new users("piyush",24);
        users u5 = new users("rahul",23);
        users u6 = new users("nibadita",22);
        users u7 = new users("ankita",22);

        Stream<users>usersStream = Stream.of(u1,u2,u3,u4,u5,u6,u7);
        usersStream.filter(i -> i.age>22).forEach(users -> System.out.println(users));
    }
}
