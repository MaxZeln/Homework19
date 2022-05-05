import Homework19.game.Guess_The_Number;
import Homework19.event.GuessEvent;
import Homework19.listeners.GuessListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

//        context.publishEvent(GuessEvent.of("Event", "first event"));

        GuessEvent event = new GuessEvent("first event");
        context.publishEvent(event);

        GuessListener listener = new GuessListener();
        listener.onApplicationEvent(event);



    }
}
