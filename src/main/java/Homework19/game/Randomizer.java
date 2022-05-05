package Homework19.game;

import lombok.Data;

import java.util.Random;

@Data
public class Randomizer {

    int min = 0;
    int max = 1000;

    private int rand = new Random().nextInt(max - min) + min;

}
