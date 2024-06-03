import java.util.Random;
import java.awt.*;


public class SpawnerThread extends Thread {
  Enemy enemy = new Enemy();
  public void paintComponent(Graphics g){
      Graphics2D g2 = (Graphics2D)g;
      enemy.drawMe(g2);
      
    }

    @Override
    public void run() {
        Enemy.enemyX = new Random().nextInt(2000);
        Enemy.enemyY = new Random().nextInt(2000);
        if ((Enemy.enemyX - TheTraflemingBoy.x < 33 && Enemy.enemyX - TheTraflemingBoy.x > -33) &&  (Enemy.enemyY - TheTraflemingBoy.y < 33 && Enemy.enemyY - TheTraflemingBoy.y > -33)){
          TheTraflemingBoy.hp -= 10;
          System.out.println("You got hit! Your Current HP is: " + TheTraflemingBoy.hp);
          if (TheTraflemingBoy.hp < 0){
            System.out.println("You lost! Your HP is now reset");
            TheTraflemingBoy.hp = 100;
          }
        }
        PlayButtonListener.ws.repaint();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Enemy.enemyX = 5000;
        Enemy.enemyY = 5000;
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    
}
