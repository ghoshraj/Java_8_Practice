package Java_8;

import java.util.Optional;
import java.util.Scanner;

class user{
    public Optional<String> getUsername(Integer id){
        String name = null;
        if (id == 100)
            name = "raj";
        else if (id == 101)
            name = "piyush";
        else if (id == 102)
            name = "rahul";
        return Optional.ofNullable(name);
    }
}
public class OptionalDemo {
    public static void main(String[] args) {
        user user = new user();
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        Optional<String>username = user.getUsername(id);
        if (username.isPresent())
            System.out.println(username.get());
        else
            System.out.println("No data found");
    }
}
