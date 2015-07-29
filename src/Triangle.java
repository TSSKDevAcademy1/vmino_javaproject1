
public class Triangle {
	private int size;

	public Triangle(int size) {
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
		String s = ""; //tvorba vystupnej premennej
		for(int i=0; i<this.size; i++){ //cyklus na celkovy pocet riadkov
			for(int j=0; j<this.size-i-1; j++){ //cyklus na pocet medzier v jednom riadku
				s+=" "; // vypisanie medzery
			}
			for(int k=0; k<(1+(2*i)); k++) { //cyklus na pocet * v jednom riadku
				s+="*"; //vypisanie medzery
			}
			s+="\n"; //koniec riadka
		}
		return s; //vratenie hodnoty 
	}

}
