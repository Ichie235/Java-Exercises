package structure;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingParsingExample {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();

        DateTimeFormatter parseDateTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        String formatedDateTime = parseDateTime.format(currentTime);
        System.out.println("This is the formattedDateTime: "+ formatedDateTime);

        String localDate = "2025-02-27";
        DateTimeFormatter parseDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDateParse = LocalDate.parse(localDate,parseDate);

        System.out.println("This is the formattedDate: "+ localDateParse);

    }
}
