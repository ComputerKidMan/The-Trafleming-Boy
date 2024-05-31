import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.Random;


public class WorldScreen extends JPanel implements Runnable {
    static Thread updateThread;
    static Thread wsThread;

    static Thread musicThread;
    static Thread spawnerThread;
    private BufferedImage myImage;
    private Graphics myBuffer;
    public boolean threadsActivated = false;
    TheTraflemingBoy MC;
    int[][] xy;
    public JPanel ws;
    public static Graphics2D g2;



    public WorldScreen() {
        repaint();

        TheTraflemingBoy.setValues(900,550,100,5,100);
        setFocusable(true);
        threadsActivated = true;
        wsThread = new Thread(this);
        updateThread = new UpdateThread();
        musicThread = new MusicThread();
        spawnerThread = new SpawnerThread();
        wsThread.start();
        updateThread.start();
        musicThread.start();
    }


    public void run() {
        while (updateThread != null) {
            repaint();



        }
    }
    public void paintComponent(Graphics g) {
        g2 = (Graphics2D)g;
        for(int i = 0; i < 1920; i = i+ 32){
            for(int ii = 0; ii < 2000; ii = ii+32) {
                    Tile.drawMe(g2, 0, 32, i, ii);
            }
        }

        TheTraflemingBoy.drawMe(g2);
        g2.dispose();



    }


}
