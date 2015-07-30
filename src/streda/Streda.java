package streda;

public class Streda {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i]+": ");
			try {
				int n = Integer.parseInt(args[i]);
				System.out.println(dayToString(n));
			} catch (NumberFormatException ex) {
				System.out.println(stringToDay(args[i].toLowerCase()));
			}
		}
	}

	public static String dayToString(int i) {
		String s;
			switch(i){
			case 1: s="Pondelisko \n"; break;
			case 2: s="Utorisko \n"; break;
			case 3: s="Streda \n"; break;
			case 4: s="Stvrtok"; break;
			case 5: s="Piatocek"; break;
			case 6: s="Soboticka"; break;
			case 7: s="Nedelicka"; break;
			default: s="Co za den si to tu zadal?"; break;
			}
		return s;
	}
	
	public static String stringToDay(String s){
		String d;
			switch(s){
			case "pondelok": d="Pondelisko"; break;
			case "utorok": d="Utorisko"; break;
			case "streda": d="Streda"; break;
			case "stvrtok": d="Stvrtok"; break;
			case "piatok": d="Piatocek"; break;
			case "sobota": d="Soboticka"; break;
			case "nedela": d="Nedelicka"; break;
			default: d="Co za den si to tu zadal?"; break;
			}
		return d;
	}
}