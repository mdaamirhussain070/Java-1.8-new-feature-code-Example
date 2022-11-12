package date;

import java.time.LocalTime;
import java.time.ZonedDateTime;

public class LocalTimeExample {


    public static void main(String[] args) {
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        System.out.println(LocalTime.of(23,50,33));

        // Getting value fro local time instance

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);



    }

}
