package Homework19.event;

import org.springframework.context.ApplicationEvent;

public class GuessEvent extends ApplicationEvent {

    public GuessEvent(Object source) {
        super(source);
    }

    public static GuessEvent of(String title, String details){
        return new GuessEvent(new EventData(title, details));
    }
}
