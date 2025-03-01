package structure;

import java.time.*;

public class ZonedDateTimeDurationPeriodExample {
    public static void main(String[] args) {
        ZonedDateTime overseasEvent = ZonedDateTime.of(2025,2,27,9,2,0,0, ZoneId.of("Asia/Tokyo"));
        System.out.println("OverseasEvent: "+ overseasEvent);

        LocalTime startTime = LocalTime.of(9,45);
        LocalTime endTime = LocalTime.of(2,45);

        Duration timeDiff = Duration.between(startTime,endTime);

        System.out.println("Duration between time: "+timeDiff);

        LocalDate startDate = LocalDate.of(1989,10,15);
        LocalDate endDate = LocalDate.of(2025,10,15);

        Period  dateDiff = Period.between(startDate,endDate);
        System.out.println("Period is: "+dateDiff);

    }
}
