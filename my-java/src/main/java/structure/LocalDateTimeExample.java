package structure;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime event = LocalDateTime.of(2025,11,23, 18,0);
        System.out.println("Event date: "+ event);
    }
}
