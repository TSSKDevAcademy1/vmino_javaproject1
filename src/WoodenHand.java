
public class WoodenHand extends Hand{
	private boolean state;
	private int damage;
	
	public WoodenHand(String color, int numberOfFingers, boolean rightHand, boolean state, int damage) {
		super(color, numberOfFingers, rightHand);
		this.state = state;
		this.damage = damage;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void doNothing(){
		if (this.state)	this.state = false;
		else this.state = false;
	}
	
	
}
