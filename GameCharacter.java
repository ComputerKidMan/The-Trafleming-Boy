import javax.swing.*;
import java.awt.*;

public class GameCharacter {
    public static Image[] getEntityImage = {new ImageIcon("MainCharacterFront.png").getImage(), new ImageIcon("Zombie.png").getImage(), new ImageIcon("Ghost.png").getImage()};
    public static void drawCharacter(Graphics2D g2, int type, int x, int y, int size){
        g2.drawImage(getEntityImage[type], x, y, size, size, null);
    }

}
