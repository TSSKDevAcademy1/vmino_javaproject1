
public abstract class Shape {
	protected int x;
	protected int y;
	protected char fill;
	protected boolean filled;

	public Shape(int x, int y, char fill, boolean filled) {
		super();
		this.x = x;
		this.y = y;
		this.fill = fill;
		this.filled = filled;
	}

	public Shape() {
		this.x = 0;
		this.y = 0;
		this.fill = '*';
		this.filled = true;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}


	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getFill() {
		return fill;
	}

	public void setFill(char fill) {
		this.fill = fill;
	}

	public String makeRow(int y, String s) {
		s = "";
		for (int a = 0; a < this.getY(); a++) {
			s += "\n";
		}
		return s;
	}

	public String makeSpace(int x, String s) {
		s = "";
		for (int a = 0; a < x; a++) {
			s += " ";
		}
		return s;
	}
}
