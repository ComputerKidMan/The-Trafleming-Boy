import javax.swing.*;
import java.awt.*;

public class WorldScreen extends JPanel implements Runnable {
    Thread thread;
    TheTraflemingBoy MC;

    public WorldScreen() {
        //soon will add in the world, items, and characters, here
        JPanel ws = new JPanel();
        JLabel wsl = new JLabel("Testing Testing Testing");
        ws.add(wsl);
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
        //super(g);
        //MC = new TheTraflemingBoy(g);

    }
}