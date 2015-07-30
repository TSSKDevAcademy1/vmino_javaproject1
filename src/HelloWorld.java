
public class HelloWorld {

	public static void main(String[] args) {
//		Uloha1("Hello_World!");
//		Uloha2("Hello_World!");
//		Uloha3("Hello_World!");
//		Uloha4("Hello_World!");
		
//		Person p = new Person("Janko Hrasko", 18);
//		System.out.println(p.toString());
		
//		Line l = new Line(4, false);
//		System.out.println(l);
		
//		Line l2 = new Line(2,2,'#',5,true);
//		System.out.println(l2);
		
//		Line l3 = new Line(2,2,'#',true,3,false);
//		System.out.println(l3);
		
//		Square square = new Square(5);
//		System.out.println(square);
		
//		Square square = new Square(2,2,'#',5);
//		System.out.println(square);
		
//		Square2 s2 = new Square2(2,2,'#',false,5);
//		System.out.println(s2);
		
//		Rectangle r = new Rectangle(10,2);
//		System.out.println(r);
		
//		Rectangle r = new Rectangle(2,2,'#',10,2);
//		System.out.println(r);
		
		Rectangle2 r2 = new Rectangle2(2,2,'#',false,10,4);
		System.out.println(r2);
		
//		Triangle t = new Triangle(7);
//		System.out.println(t);
		
//		Triangle t = new Triangle(2,2,'#',5);
//		System.out.println(t);
		
//		Triangle2 t2 = new Triangle2(2,2,'#', false,6);
//		System.out.println(t2);
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
