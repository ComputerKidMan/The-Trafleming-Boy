public class MainCharacter extends GameCharacter{
private int size;
private Color color;
private int speed;
int x = 0;
int y  = 0;
private int[][] location = [x][y];
private int hp;
	public MainCharacter(){
		super([0][0], 100, new Color(155,155,25), 2, 100);
		}
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
	}
}
