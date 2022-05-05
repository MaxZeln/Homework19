package Homework19.game;

import lombok.Data;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

@Data
public class Guess_The_Number {
    private final Randomizer rand;
    private final Guess_Scanner scanner;
    private final ResourceBundleMessageSource resource;

    public Guess_The_Number(Randomizer rand, Guess_Scanner scanner, ResourceBundleMessageSource resource) {
        this.rand = rand;
        this.scanner = scanner;
        this.resource = resource;
    }

    public void Guess() {
        System.out.println(rand.getRand());


        System.out.println(resource.getMessage("startGame", null, Locale.getDefault()));
        System.out.println(resource.getMessage("startGame", null, Locale.US));
        System.out.println();
        System.out.println(resource.getMessage("startGame2", null, Locale.getDefault()));
        System.out.println(resource.getMessage("startGame2", null, Locale.US));
        System.out.println();
        System.out.println(resource.getMessage("exitGame", null, Locale.getDefault()));
        System.out.println(resource.getMessage("exitGame", null, Locale.US));

        while(true) {

            int guess = scanner.getScanner().nextInt();

            if (guess == -1) {
                System.out.println(resource.getMessage("exitGame2", null, Locale.getDefault()));
                System.out.println(resource.getMessage("exitGame2", null, Locale.US));

                System.out.println(resource.getMessage("exitGame3", null, Locale.getDefault()) + " " + rand.getRand());
                System.out.println(resource.getMessage("exitGame3", null, Locale.US) + " " + rand.getRand());
                break;
            }
            else if (rand.getRand() == guess) {
                System.out.println(resource.getMessage("numberGuessedRight", null, Locale.getDefault()) + " " + rand.getRand());
                System.out.println(resource.getMessage("numberGuessedRight", null, Locale.US) + " " + rand.getRand());
                break;
            }
            else if (rand.getRand() > guess) {
                System.out.println(resource.getMessage("numberBigger", null, Locale.getDefault()));
                System.out.println(resource.getMessage("numberBigger", null, Locale.US));
            }
            else if (rand.getRand() < guess) {
                System.out.println(resource.getMessage("numberLess", null, Locale.getDefault()));
                System.out.println(resource.getMessage("numberLess", null, Locale.US));

            }

        }

    }

}
