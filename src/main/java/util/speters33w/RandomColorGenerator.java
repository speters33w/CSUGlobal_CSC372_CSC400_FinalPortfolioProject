package util.speters33w;

import java.awt.Color;
import java.util.Random;

@SuppressWarnings("checkstyle:magicnumber")
public final class RandomColorGenerator {

    private RandomColorGenerator() {}

    /**
     * Returns a randomly created greenish java.awt.Color.
     *
     * @return a randomly created greenish java.awt.Color.
     */
    public static Color shadesOfGreen(){
        Random random = new Random();
        int r = random.nextInt(0,120);
        int g = random.nextInt(100,255);
        int b = random.nextInt(0,120);
        return new Color(r, g, b);
    }

    /**
     * Returns a randomly created orange java.awt.Color.
     *
     * @return a randomly created orange java.awt.Color.
     */
    public static Color shadesOfOrange(){
        Random random = new Random();
        int r = 255;
        int g = random.nextInt(100,150);
        int b = random.nextInt(0,80);
        return new Color(r, g, b);
    }

}
