package Homework19.listeners;

import Homework19.event.GuessEvent;
import Homework19.game.Guess_The_Number;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GuessListener implements ApplicationListener<GuessEvent> {

    @Override
    public void onApplicationEvent(GuessEvent event) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Guess_The_Number guess_the_number = context.getBean(Guess_The_Number.class);
        guess_the_number.Guess();
//        System.out.println("Event");
    }
}
