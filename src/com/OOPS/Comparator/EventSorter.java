package com.OOPS.Comparator;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Event {
    String eventName;
    LocalTime startTime;
    LocalTime endTime;

    public Event(String eventName, int startTime, int endTime) {
        this.eventName = eventName;
        this.startTime = convertToTime(startTime);
        this.endTime = convertToTime(endTime);
    }

    private LocalTime convertToTime(int time) {
        int hours = time / 100;
        int minutes = time % 100;
        return LocalTime.of(hours, minutes);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return eventName + " - " + startTime.format(formatter) + " to " + endTime.format(formatter);
    }
}

public class EventSorter {
    public static void main(String[] args) {
        List<Event> events = new ArrayList<>();

        String str = "Hi";

        System.out.println( str.concat("Raaj"));
        events.add(new Event("Meeting A", 1330, 1530));
        events.add(new Event("Conference", 1000, 1200));
        events.add(new Event("Workshop", 1000, 1130));
        events.add(new Event("Seminar", 1400, 1500));
        events.add(new Event("Team Lunch", 1330, 1430));

        // Sorting based on startTime, then endTime, then eventName
        events.sort(Comparator.comparing((Event e) -> e.startTime)
                .thenComparing(e -> e.endTime)
                .thenComparing(e -> e.eventName));

        // Printing the sorted list
        for (Event e : events) {
            System.out.println(e);
        }
    }
}