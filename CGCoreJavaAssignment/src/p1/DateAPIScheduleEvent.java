package p1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;


public class DateAPIScheduleEvent {
    public static void main(String[] args) {

        LocalDateTime eventStartingDate = LocalDateTime.of(LocalDate.now(), LocalTime.of(10, 0));

        // Setting of event timeline for next 6 months
        int timeLineLimit = 6;

        // Code to Schedule a Event
        System.out.println("Event Schedule: \n");
        for (int i = 0; i < timeLineLimit; i++) {
            LocalDateTime eventDatesWithTime = eventStartingDate.plusMonths(i).with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.MONDAY)); // 2nd Monday

            DateTimeFormatter format =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            String output = eventDatesWithTime.format(format);
            System.out.println("Event " + (i + 1) + " : " + output );

        }
    }//end main
}//end class