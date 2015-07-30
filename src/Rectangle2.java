
public class Rectangle2 extends Shape {
	private int width;
	private int height;

	public Rectangle2(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle2(int x, int y, char fill, boolean filled, int width, int height) {
		super(x, y, fill, filled);
		this.width = width;
		this.height = height;
	}

	public String toString() {
		String s = "";
		Line l = new Line(this.x, 0, this.fill, this.filled, this.width, false);
		s += this.makeRow(this.y, s);
		if (filled) {
			for (int i = 0; i < height; i++) {
				s += l + "\n";
			}
		} else {
			l.setFilled(true);
			s+= l + "\n";
			l.setFilled(false);
			for (int i = 0; i < height-2; i++) {
				s += l + "\n";
			}
			l.setFilled(true);
			s+= l + "\n";
		}
		return s;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
