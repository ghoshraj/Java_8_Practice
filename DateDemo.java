package Java_8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);

        //converting date to string
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String format = sdf.format(d);
        System.out.println(format);

        //converting string to date
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse("2024-12-20");
        System.out.println(date);
    }
}
