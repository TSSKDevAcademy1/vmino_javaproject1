
public class HelloWorld {

	public static void main(String[] args) {
//		Uloha2("Hello_World!");
		
//		Person p = new Person("Janko Hrasko", 18);
//		System.out.println(p.toString());
		
//		Line l = new Line(4, false);
//		System.out.println(l);
		
//		Square square = new Square(5);
//		System.out.println(square);
		
//		Rectangle r = new Rectangle(10,2);
//		System.out.println(r);
		
		Triangle t = new Triangle(7);
		System.out.println(t);
	}

	public static void Uloha1(String s){
		for (int i = 0; i < s.length()-1; i++) {
			String newS = s.substring(0, s.length() - i);
			System.out.println(newS);
		}
	}
	
	public static void Uloha2(String s){
		for (int i = 0; i < s.length(); i++) {
			String newS = s.substring(i, s.length());
			System.out.println(newS);
		}
	}
	
	public static void Uloha3(String s){
		for (int i = 0; i < s.length() / 2; i++) {
			String newS = s.substring(i, s.length() - i);
			System.out.println(newS);
		}
	}
	
	public static void Uloha4(String s){
		for (int i = 0; i < s.length() / 2; i++) {
			String newS = s.substring(i, s.length() - i);
			for (int j = 0; j < i; j++) {
				newS = " " + (newS);
			}
			System.out.println(newS);
		}
	}
}
