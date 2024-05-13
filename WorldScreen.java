import javax.swing.*;

public class WorldScreen extends JPanel implements Runnable{
    Thread thread;
    MainCharacter MC;
    public WorldScreen(){
        //soon will add in the world, items, and characters, here
        thread = new Thread(this);
        thread.start();
        new run();
    }
    @Override
    public void run(){
        while (thread != null){
            long systemTime = system.time();
            //MC.keyCode();add key codes that change direction
            repaint();
        }

        
    }
    public void paintComponent(Graphics g){
        super(g);
        //MC = new MainCharacter(g);
    
}
