
public class Square extends Shape {
	private int size;	
	
	public Square(int size) {
		super();
		this.size = size;
	}
	public Square(int x, int y, char fill, boolean filled , int size) {
		super(x,y,fill, filled);
		this.size = size;
	}

	@Override
	public String toString() {
		String s = "";
		s+=this.makeRow(this.y, s);
        for(int i = 0; i < size; i++) {
        	s+=this.makeSpace(this.x, s);
            for(int j = 0; j < size; j++) {
                s+=this.fill;
            }
            s+="\n";
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
