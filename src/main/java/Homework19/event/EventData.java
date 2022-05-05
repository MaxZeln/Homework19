package Homework19.event;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventData {

    private final LocalDateTime createdAt;
    private final String title;
    private final String details;


    public EventData( String title, String details) {
        this.title = title;
        this.details = details;
        createdAt = LocalDateTime.now();
    }
}
