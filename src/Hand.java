
public class Hand {

	protected String color;
	protected int numberOfFingers;
	protected boolean rightHand;
	
	public Hand(String color, int numberOfFingers, boolean rightHand) {
		super();
		this.color = color;
		this.numberOfFingers = numberOfFingers;
		this.rightHand = true;
	}
	
	public Hand() {
		this.color = "white";
		this.numberOfFingers = 5;		
	}
	
	public void Open() {
		
	}
	
	public void Close() {
		
	}
	
	public void Wave() {
		
	}
	
	public void ShowFinger() {
		
	}
}
