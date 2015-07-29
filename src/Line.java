
public class Line {
int length;
boolean vertical;

	public Line(int length, boolean vertical) {
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
		if(vertical){
			for(int i=0; i<length+1; i++){
				s+="*\n";
			}
		}
		else {
			for(int i=0; i<length+1;i++){
				s+="*";
			}
		}
		return s;
	}
 
}
