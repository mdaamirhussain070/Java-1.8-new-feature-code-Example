package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {
    public static void main(String[] args) {

        //Local Date
        LocalDate localDate=LocalDate.now();
        System.out.println("localDate: "+localDate);
        //Local Time
        LocalTime localTime=LocalTime.now();
        System.out.println("localTime: "+localTime);
        // Local DateTime
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("localDateTime: "+localDateTime );
    }
}
