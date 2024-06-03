import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Enemy extends GameCharacter {
  public static int enemyX;
  public static int enemyY;

    public void drawMe(Graphics2D g2){
        super.drawCharacter(g2, new Random().nextInt(4), enemyX, enemyY, 32);
    }
}
