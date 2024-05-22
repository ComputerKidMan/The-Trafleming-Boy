import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TheTraflemingBoy extends GameCharacter {
    public static int size;
    public static int speed;
    public static int x;
    public static int y;
    public static int hp;

    public static void setValues(int x, int y, int size, int speed, int hp) {

        TheTraflemingBoy.x = x;
        TheTraflemingBoy.y = y;
        TheTraflemingBoy.size = size;
        TheTraflemingBoy.speed = speed;
        TheTraflemingBoy.hp = hp;
    }

    public static void drawMe(Graphics2D g2){
        g2.drawImage(new ImageIcon("MainCharacterFront.png").getImage(), x, y, size, size, null);
    }
}
