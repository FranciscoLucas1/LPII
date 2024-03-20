
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;



public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date data1 = new Date();
        System.out.println(sdf.format(data1));

        Date data2 = sdf.parse("15/05/2015");

        System.out.println(data2);


        Calendar cal = Calendar.getInstance();
        cal.setTime(data2);
        cal.add(Calendar.DAY_OF_WEEK, -2);
        data2 = cal.getTime();
        System.out.println(data2);

        System.out.println(cal.get(Calendar.YEAR));



        /*
        LocalDate data1 = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        Instant data3 = Instant.now();
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);

        data1 = LocalDate.parse("2023-10-10");
        System.out.println(data1);

        */
    }
}