package streda;

public class Days {

	public String dayToString(int i) {
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

}
