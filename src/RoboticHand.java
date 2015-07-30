
public class RoboticHand extends Hand{
	private int length;
	private boolean state;
	private int damage;
	
	public RoboticHand(String color, int numberOfFingers, boolean rightHand, int length, boolean state) {
		super(color, numberOfFingers, rightHand);
		this.length = length;
		this.state = state;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isState() {
		return state;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void turnOn(){
		this.state = true;
	}
	
	public void turnOff(){
		this.state = false;
	}
	
	public void makeBigger(int l){
		this.length += l;
	}
	
	public void makeSmaller(int l){
		this.length -= l;
	}
}
