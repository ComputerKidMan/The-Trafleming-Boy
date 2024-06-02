import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Update extends WorldScreen implements KeyListener {
    boolean right;
    boolean up;
    boolean pSwap;
    boolean down;
    boolean left;
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
        if (e.getKeyCode() == KeyEvent.VK_P){
            pSwap = true;
            WorldScreen.musicThread = null;
            WorldScreen.updateThread = null;
            PlayButtonListener.ws = null;
            new GameScreen();
            Driver.panel.setContentPane(GameScreen.gs);
            repaint();
            revalidate();
            Driver.panel.pack();
            Driver.panel.setSize(new Dimension(1920, 1200));
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
        if (e.getKeyCode() == KeyEvent.VK_P) {
            pSwap = false;
        }
    }
}
