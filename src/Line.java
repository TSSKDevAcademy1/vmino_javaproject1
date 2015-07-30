
public class Line extends Shape {
	int length;
	boolean vertical;

	public Line(int length, boolean vertical) {
		super();
		this.length = length;
		this.vertical = vertical;
	}

	public Line(int x, int y, char fill, boolean filled, int length, boolean vertical) {
		super(x, y, fill, filled);
		this.length = length;
		this.vertical = vertical;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isVertical() {
		return vertical;
	}

	public void setVertical(boolean vertical) {
		this.vertical = vertical;
	}

	@Override
	public String toString() {
		String s = "";
		s += this.makeRow(this.y, s);
		if (vertical) {
			for (int i = 0; i < length; i++) {
				s += this.makeSpace(this.x, s);
				s += this.fill + "\n";
			}
		} else {
			s += this.makeSpace(this.x, s);
			if (this.filled) {
				for (int i = 0; i < length; i++) {
					s += this.fill;
				}
			} else {
				s += this.fill;
				if (length >= 2) {
					s += this.makeSpace(this.length-2, s);
					s += this.fill;
				}
				
			}
		}
		return s;
	}

}
