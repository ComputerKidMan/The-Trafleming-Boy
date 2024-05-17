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


    public void setSize(int size) {
        this.size = size;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public static void drawMe(Graphics2D g2){
        g2.drawImage(new ImageIcon("MainCharacterFront.png").getImage(), x, y, size, size, null);
    }
}


class MCKey extends KeyAdapter {


    public void keyPressed(KeyEvent e) {
        boolean right = false;
        boolean up = false;
        boolean down = false;
        boolean left = false;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT/* && !right*/) {
            TheTraflemingBoy.x += TheTraflemingBoy.speed;
            right = true;

        }


        if (e.getKeyCode() == KeyEvent.VK_UP/* && !up*/) {
            TheTraflemingBoy.y += TheTraflemingBoy.speed;
            up = true;
        }


        if (e.getKeyCode() == KeyEvent.VK_DOWN/* && !down*/) {
            TheTraflemingBoy.y += TheTraflemingBoy.speed;
            down = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT/* && !left*/) {
            TheTraflemingBoy.x -= TheTraflemingBoy.speed;
            left = true;
        }

    }
}