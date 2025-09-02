package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

    public static void main(String[] args) throws ParseException {

        String dateStr = "24/03/2025";
        System.out.println(dateStr);

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");


        Date date = sd.parse(dateStr);

        System.out.println("date = "+date);

    }
}
