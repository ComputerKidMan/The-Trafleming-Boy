import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.Random;


public class WorldScreen extends JPanel implements Runnable, KeyListener {
    boolean right;
    boolean up;

    Thread thread;
    private BufferedImage myImage;
    private Graphics myBuffer;
    TheTraflemingBoy MC;
    Key keyCode;
    Tile tile = new Tile();
    boolean down;
    boolean left;



    public WorldScreen() {
        TheTraflemingBoy.setValues(900,550,100,5,100);
        keyCode = new Key();
        //soon will add in the world, items, and characters, here
        /*JPanel ws = new JPanel();
        JLabel wsl = new JLabel("Testing Testing Testing");
        ws.add(wsl);
        Driver.panel.setContentPane(ws);*/

        addKeyListener(this);
        this.setFocusable(true);
        thread = new Thread(this);
        thread.start();
    }


    public void run() {
        while (thread != null) {
            //try {
            //new PlayTheme("MainTheme.wav");
            System.out.println();
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        /*} catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

         */

            }
        }
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        for(int i = 0; i < 1920; i = i+ 32){
            for(int ii = 0; ii < 2000; ii = ii+32) {
                tile.drawMe(g2, i, ii);
            }
        }

        TheTraflemingBoy.drawMe(g2);
        g2.dispose();



    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_D) {
            TheTraflemingBoy.x += TheTraflemingBoy.speed;
            right = true;
        }


        if (e.getKeyCode() == KeyEvent.VK_W) {
            TheTraflemingBoy.y -= TheTraflemingBoy.speed;
            up = true;
        }


        if (e.getKeyCode() == KeyEvent.VK_S) {
            TheTraflemingBoy.y += TheTraflemingBoy.speed;
            down = true;
        }


        if (e.getKeyCode() == KeyEvent.VK_A) {
            left = true;
            TheTraflemingBoy.x -= TheTraflemingBoy.speed;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            right = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            up = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            down = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            left = false;
        }
    }
}
