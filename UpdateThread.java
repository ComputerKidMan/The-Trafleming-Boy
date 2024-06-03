import java.util.Random;
import java.awt.*;


public class UpdateThread extends Thread {
  
  public void paintComponent(Graphics g){
      Graphics2D g2 = (Graphics2D)g;
      Tile.drawMe(g2, new Random().nextInt(6), 36, new Random().nextInt(2000), new Random().nextInt(1980));
    }

    @Override
    public void run() {
        PlayButtonListener.ws.repaint();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    
}
