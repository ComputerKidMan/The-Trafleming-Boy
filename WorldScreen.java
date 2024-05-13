import javax.swing.*;

public class WorldScreen extends JPanel implements Runnable{
    Thread thread;
    public WorldScreen(){
        //soon will add in the world, items, and characters, here
        thread = new Thread(this);
        thread.start();
        new run();
    }
    @Override
    public void run(){
        while (thread != null){
            //add key codes that change direction
            repaint();
        }

        
    }
    public void paintComponent(Graphics g){
        super(g);
        //new spawnMainCharacter(g)
    
}
