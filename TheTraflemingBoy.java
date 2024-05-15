public class TheTraflemingBoy extends GameCharacter{
private int size;
private int speed;
int x =;
int y  = 0;
private int hp;
	public TheTraflemingBoy(int x, int y, int size, int size, int speed, int hp){
		this.x = x;
		this.y = y;
		this.size = size;
		this.speed = speed;
		this.hp = hp;
		}
	public void setSize(int size){
		this.size = size;
		}
	public void setSpeed(int speed){
		this.speed = speed;
		}
	public void setLocation(int[][] location){
		this.location = location;
		}
	public void setColor(Color color){
		this.color = color;
		}
	public void setHP(int hp){
		this.hp = hp;
		}
	public drawMe(Graphics g2){
		g2.drawImage(new ImageIcon("MainCharacter.png", x, y, size, size, null);
	}
}

class Key extends KeyAdapter
{
	boolean right = false;
	boolean up = false;
	boolean down = false;
	boolean left = false;
	MainCharacter MC = MainCharacter();
	
public void keyPressed(KeyEvent e)
{
if(e.getKeyCode() == KeyEvent.VK_RIGHT && !right)
{
}


if(e.getKeyCode() == KeyEvent.VK_UP && !up)
{
}


if(e.getKeyCode() == KeyEvent.VK_DOWN && !down)
{
}

