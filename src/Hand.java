
public class Hand {

	protected String color;
	protected int numberOfFingers;
	protected Side side;
	
	public enum Side{
		LEFT,
		RIGHT
	}
	
	public Hand(String color, int numberOfFingers, Side side) {
		super();
		this.color = color;
		this.numberOfFingers = numberOfFingers;
		this.side = side;
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
