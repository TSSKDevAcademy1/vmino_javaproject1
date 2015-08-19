import java.text.*;
import java.util.Date;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// Uloha1("Hello_World!");
		// Uloha2("Hello_World!");
		// Uloha3("Hello_World!");
		// Uloha4("Hello_World!");

		// Person p = new Person("Janko Hrasko", 18);
		// System.out.println(p.toString());

		// Line l = new Line(4, false);
		// System.out.println(l);

		// Line l2 = new Line(2,2,'#',5,true);
		// System.out.println(l2);

		// Line l3 = new Line(2,2,'#',true,3,false);
		// System.out.println(l3);

		// Square square = new Square(5);
		// System.out.println(square);

		// Square square = new Square(2,2,'#',5);
		// System.out.println(square);

		// Square2 s2 = new Square2(2,2,'#',false,5);
		// System.out.println(s2);

		// Rectangle r = new Rectangle(10,2);
		// System.out.println(r);

		// Rectangle r = new Rectangle(2,2,'#',10,2);
		// System.out.println(r);

		// Rectangle2 r2 = new Rectangle2(2,2,'#',false,10,4);
		// System.out.println(r2);

		// Triangle t = new Triangle(7);
		// System.out.println(t);

		// Triangle t = new Triangle(2,2,'#',5);
		// System.out.println(t);

		// Triangle2 t2 = new Triangle2(2,2,'#', false,6);
		// System.out.println(t2);

		// Shape[] shapes = new Shape[10];
		// shapes[0] = new Rectangle2(2, 2, '#', false, 10, 4);
		// shapes[1] = new Triangle2(2, 2, '#', false, 6);
		// shapes[2] = new Square2(2, 2, '#', false, 5);
		// shapes[3] = new Line(2, 2, '#', true, 3, false);
		// shapes[4] = new Rectangle2(2, 2, '#', false, 10, 4);
		// shapes[5] = new Triangle2(2, 2, '#', false, 6);
		// shapes[6] = new Line(2, 2, '#', true, 3, false);
		// shapes[7] = new Rectangle2(2, 2, '#', false, 10, 4);
		// shapes[8] = new Triangle2(2, 2, '#', false, 6);
		// shapes[9] = new Line(2, 2, '#', true, 3, false);
		// for (Shape s : shapes) {
		// s.move(10, 1);
		// System.out.println(s);
		// }
		// Scanner scan = new Scanner(System.in);
		// String s = System.console().readLine();
		// System.out.println(scan.next());

		// int a = 123;
		// int b = 56;
		// System.out.println(swap(a,b,b));

		// System.out.println(palindrome("1989"));

		// System.out.println(Math.PI);
		// System.out.println(Math.pow(9.0, 2.0));
		// System.out.println(Math.sin(Math.toRadians(90)));
		// System.out.println(Math.sqrt(9));
		// System.out.println(Math.floor(5.9));
		// System.out.println(Math.ceil(5.9));
		// System.out.println(Math.max(5.5, 9.9));
		// System.out.println(Math.abs(-2.0));
		// System.out.println(Math.E);
		//
		// System.out.println(Byte.MAX_VALUE);
		// System.out.println(Short.MAX_VALUE);
		// System.out.println(Integer.MAX_VALUE);
		// System.out.println(Long.MAX_VALUE);
		// System.out.println(Float.MAX_VALUE);
		// System.out.println(Double.MAX_VALUE);
		//
		// System.out.println(Integer.toBinaryString(128));
		// System.out.println(Integer.toOctalString(128));
		// System.out.println(Integer.toHexString(128));
		//
		// System.out.println(System.getProperty("file.separator"));
		// System.out.println(System.getProperty("path.separator"));
		// System.out.println(System.getProperty("line.separator"));
		// System.out.println(System.getProperty("user.name"));
		// System.out.println(System.getProperty("user.home"));
		// System.out.println(System.getProperty("user.dir"));
		// System.out.println(System.getProperty("java.version"));
		// System.out.println(System.getProperty("java.home"));
		// System.out.println(System.getProperty("java.class.path"));
		//
		// long mili = System.currentTimeMillis();

		// StringBuilder builder = new StringBuilder();
		//
		// String a = "ahoj";
		// String b = "mravec";
		// long start = System.currentTimeMillis();
		// for (int i = 0; i< 10000; i++){
		// String c = a.concat(b);
		//// System.out.println(c);
		// }
		// long end = System.currentTimeMillis();
		// long time = end - start;
		// System.out.println(time);

		// long start = System.currentTimeMillis();
		// for (int i = 0; i< 10000; i++){
		// String c = a + b;
		//// System.out.println(c);
		// }
		// long end = System.currentTimeMillis();
		// long time = end - start;
		// System.out.println(time);

		// long start = System.currentTimeMillis();
		// for (int i = 0; i< 10000; i++){
		// builder.append(a).append(b);
		// }
		// long end = System.currentTimeMillis();
		// long time = end - start;
		// System.out.println(time);
		// System.out.println(702/26);
		// int XXX = 702;
		// System.out.println(getLetter(XXX));
		// System.out.println(getLetterRek(XXX));
		// System.out.println(getLetterRek2(XXX));
		// System.out.println(Date(System.currentTimeMillis()));
		Date date = new Date(System.currentTimeMillis());
		DateFormat df = DateFormat.getInstance();
		String s;
		s = df.format(date);
		System.out.println(s);
		s = df.getDateInstance().format(date);
		System.out.println(s);
		s = df.getTimeInstance().format(date);
		System.out.println(s);
//		date = df.getDateInstance().parse("3.12.2006");
		System.out.println(date);

	}

	public static void Uloha1(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			String newS = s.substring(0, s.length() - i);
			System.out.println(newS);
		}
	}

	public static void Uloha2(String s) {
		for (int i = 0; i < s.length(); i++) {
			String newS = s.substring(i, s.length());
			System.out.println(newS);
		}
	}

	public static void Uloha3(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			String newS = s.substring(i, s.length() - i);
			System.out.println(newS);
		}
	}

	public static void Uloha4(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			String newS = s.substring(i, s.length() - i);
			for (int j = 0; j < i; j++) {
				newS = " " + (newS);
			}
			System.out.println(newS);
		}
	}

	public static int swap(int a, int b, int c) {
		a = a + b;
		b = a - b;
		a = a - b;

		if (c == a) {
			return b;
		} else {
			return a;
		}
	}

	public static String palindrome(String s) {
		StringBuilder string = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			string.append(s.charAt(s.length() - 1 - i));
		}
		return string.toString();
	}

	// private static String getLetter(int row) {
	// int ch;
	// String result = "";
	// if(row/26 == 0){
	// ch = (row%26)+65;
	// result+=Character.toString((char) ch);
	// }
	// else{
	// ch=(row/26)+64;
	// result+=Character.toString((char) ch);
	// ch=(row%26)+65;
	// result+=Character.toString((char) ch);
	// }
	// return result;
	// }

	// private static String getLetterRek(int row) {
	// int ch;
	// String result = "";
	// if (row / 26 == 0) {
	// ch = (row % 26) + 65;
	// result += Character.toString((char) ch);
	// } else {
	// ch = (row / 26) + 64;
	// result+= Character.toString((char) ch);
	// ch=(row%26)+65;
	// result+=Character.toString((char) ch);
	// if(row/26 > 26){
	// result+=getLetterRek(row / 26 / 27);
	// }
	//
	// }
	// return result;
	// }

	// private static String getLetterRek2(int row) {
	// String result = "";
	// int[] ch = new int[50];
	// int i=0;
	// if(row/26 == 0){
	// ch[i] = row%26;
	// }
	// else{
	// row=row/26;
	// i++;
	// ch[i]=Integer.parseInt(getLetterRek2(row));
	// }
	// for(int j=0; j<i;j++){
	// result+= Character.toString((char) (ch[j]+65));
	// }
	// return result;
	//
	// }
}