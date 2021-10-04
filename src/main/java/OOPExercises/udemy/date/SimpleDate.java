package OOPExercises.udemy.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        //Y - year
        //M - month
        //d - day
        //h - hour
        //m - minute
        //s - second
        //S - milisecond
        //E - day of week
        //D - day of year
        //w - number of weak in year
        //W - number of weak in month
        //a - A.M. / P.M.
        //z - time zone

        SimpleDateFormat formatedDate = new SimpleDateFormat("E HH:mm:ss dd-MM-YYYY");
        System.out.println(formatedDate.format(date));
    }
}
