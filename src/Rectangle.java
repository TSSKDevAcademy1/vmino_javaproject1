
public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int x, int y, char fill , boolean filled,int width, int height) {
		super(x,y,fill, filled);
		this.width = width;
		this.height = height;
	}
	
	public String toString(){
		String s = "";
		s+=this.makeRow(this.y, s);
        for(int i = 0; i < height; i++) {
        	s+=this.makeSpace(this.x, s);
            for(int j = 0; j < width; j++) {
                s+=this.fill;
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
