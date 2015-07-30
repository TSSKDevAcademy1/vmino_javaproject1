
public class Square2 extends Shape {
	private int size;

	public Square2(int size) {
		super();
		this.size = size;
	}

	public Square2(int x, int y, char fill, boolean filled, int size) {
		super(x,y,fill, filled);
		this.size = size;
	}

	@Override
	public String toString() {
		String s = "";
		Line l = new Line(this.x, 0, this.fill, this.filled, this.size, false);
		s += this.makeRow(this.y, s);
		if (filled) {
			for (int i = 0; i < size; i++) {
				s += l + "\n";
			}
		} else {
			l.setFilled(true);
			s += l + "\n";
			l.setFilled(false);
			for (int i = 0; i < size -2; i++) {
				s += l + "\n";
			}
			l.setFilled(true);
			s += l + "\n";
		}
		return s;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
