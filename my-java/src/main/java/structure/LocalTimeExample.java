package structure;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime meetingTime = LocalTime.of(1,30);
        System.out.println("Meeting time: "+ meetingTime);
    }
}
