
public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public String toString(){
		String s = "";
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                s+="*";
            }
            s+="\n";
        }
		return s;
	}
	
	public int getWidth(){
		return width;
	}
	
	public void setWidth(int width){
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
}
