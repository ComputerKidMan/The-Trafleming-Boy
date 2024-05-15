import javax.swing.*;
import java.awt.*;

public class WorldScreen extends JPanel implements Runnable {
    Thread thread;
    TheTraflemingBoy MC;

    public WorldScreen() {
        //soon will add in the world, items, and characters, here
        MC = new TheTraflemingBoy(50, 50, 50, 50, 3, 100);
        repaint();
        revalidate();
        thread = new Thread(this);
        thread.start();
        //run();
        /*

        try {
            Thread.sleep(10000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
         */
    }

    @Override
    public void run() {
        while (thread != null) {
            //long systemTime = System.currentTimeMillis();
            //MC.keyCode();add key codes that change direction
            repaint();

        }


    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g2;
        MC.drawMe(g2);
    }
}
