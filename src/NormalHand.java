
public class NormalHand extends Hand {
	private boolean healthy;
	private int health;
	
	public NormalHand(String color, int numberOfFingers, boolean rightHand, boolean healthy, int health) {
		super(color, numberOfFingers, rightHand);
		this.healthy = healthy;
		this.health = health;
	}
	
	public boolean isHealthy() {
		return healthy;
	}

	public void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void die() {
		this.healthy = false;
	}
	
	public void hurt(int x) {
		this.health -= x;
		if (this.health <=0) {
			die();
		}
	}
	
	public void heal(int x) {
		if (this.health>0)
		this.health += x;
	}

}