
public class Square {
	private int size;	
	
	public Square(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		String s = "";
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                s+="*";
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
