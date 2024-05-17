import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class WorldScreen extends JPanel implements Runnable {
    Thread thread;
    private BufferedImage myImage;
    private Graphics myBuffer;

    public WorldScreen() {
        //soon will add in the world, items, and characters, here
        /*JPanel ws = new JPanel();
        JLabel wsl = new JLabel("Testing Testing Testing");
        ws.add(wsl);
        Driver.panel.setContentPane(ws);*/
        TheTraflemingBoy.setValues(900,550,100,3,100);
        Driver.panel.addKeyListener(new MCKey());
        repaint();
        thread = new Thread(this);
        thread.start();
    }


    public void run() {
        while (thread != null) {
            //try {
            //new PlayTheme("MainTheme.wav");
            //MC.keyCode();

            repaint();
                //Thread.sleep(100);
            /*} catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

             */

        }


    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        TheTraflemingBoy.drawMe(g2);


    }
}