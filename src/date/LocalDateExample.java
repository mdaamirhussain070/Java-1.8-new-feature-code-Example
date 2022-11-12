package date;

import java.time.LocalDate;
import java.time.temporal.*;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println("localDate: "+localDate);

        LocalDate localDate1=LocalDate.of(2018,8,5);
        System.out.println("localDate1 : "+localDate1);

        LocalDate localDate2=LocalDate.ofYearDay(2020,36);
        System.out.println("localDate2: "+localDate2);

        // Get value from LocalDate
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());

        //Modifing Local Date
        System.out.println("Local date"+localDate);
        System.out.println("Local Date + 2 days"+localDate.plusDays(2));
        System.out.println("Local date with year "+localDate.withYear(2019));
        System.out.println("with chrono field "+localDate.with(ChronoField.YEAR,2020));
        System.out.println("with TemporalAdjuster "+ localDate.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("chrono unit minus "+localDate.minus(1, ChronoUnit.YEARS));

        // Additional Support method

        System.out.println(localDate.isLeapYear());
        System.out.println(LocalDate.ofYearDay(2024,01).isLeapYear());
        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate.isEqual(localDate1));



    }
}
