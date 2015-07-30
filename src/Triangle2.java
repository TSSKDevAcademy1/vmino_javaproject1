
public class Triangle2 extends Shape{
	private int size;

	public Triangle2(int size) {
		super();
		this.size = size;
	}
	
	public Triangle2(int x, int y, char fill, boolean filled, int size){
		super(x,y,fill, filled);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public boolean setSize(int size) {
		if(size <0) {
			return false;
		}
		this.size = size;
		return true;  
	}

	@Override
	public String toString() {
		String s = ""; // tvorba vystupnej premennej
		Line l = new Line(this.x, 0, this.fill, this.filled, this.size, false);
		s += this.makeRow(this.y, s);
		for (int i = 0; i < this.size; i++) { // cyklus na celkovy pocet riadkov
			l.setX(this.size - i - 1 + this.x);
			if (filled) {
				l.setFilled(true);
			} else {
				if ((1 + 2 * i) > 2 && (1 + 2 * i) < (1+2*(this.size-1)) ) {
					l.setFilled(false);
				}
				else {
					l.setFilled(true);
				}
				
			}
			l.setLength(1 + 2 * i);
			s += l + "\n";
		}
		return s; // vratenie hodnoty
	}

}
