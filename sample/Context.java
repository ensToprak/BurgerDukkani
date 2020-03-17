package sample;
import Sos.*;
import YanUrun.*;
import Tatli.*;
public class Context {
	private Menu menu;

	public Context(Menu menu) {
		this.menu = menu;
	}
	
	public float executeMenu() {
		return menu.menu();
	}
	public void executeEt(int etSecim, int etM) {
		menu.et(etSecim, etM);
	}
	public void executeMalzeme(int malzemeSecim, int malzemeM) {
		menu.malzeme(malzemeSecim, malzemeM);
	}
	public void executeSos(int sosSecim, int sosM) { menu.sos(sosSecim, sosM);}
	public void executeIcecek(int icecekSecim, int icecekM) {
		menu.icecek(icecekSecim, icecekM);
	}
	public void executeYanUrun(int yanUrunSecim, int yanUrunM) {
		menu.yanUrun(yanUrunSecim, yanUrunM);
	}
	public void executeTatli(int tatliSecim, int tatliM) {
		menu.tatli(tatliSecim, tatliM);
	}
}
