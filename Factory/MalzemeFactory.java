package Factory;
import Et.Et;
import Icecek.Icecek;
import Malzeme.CheddarPeyniri;
import Malzeme.Domates;
import Malzeme.Malzeme;
import Malzeme.Marul;
import Malzeme.Sogan;
import Sos.Sos;
import Tatli.Tatli;
import YanUrun.YanUrun;

public class MalzemeFactory extends BurgerMenuFactory{
	public Et getEt(int etSecimi) {
		return null;
	}
	public Malzeme getMalzeme(int malzemeSecimi) {
		switch(malzemeSecimi) {
		case 1:
			return new CheddarPeyniri();
		case 2:
			return new Sogan();
		case 3:
			return new Domates();
		case 4:
			return new Marul();
		default:
			return null;
		}
	}
	public Sos getSos(int sosSecimi) {
		return null;
	}
	public Icecek getIcecek(int icecekSecimi) {
		return null;
	}
	public YanUrun getYanUrun(int yanUrunSecimi) {
		return null;
	}
	public Tatli getTatli(int tatliSecimi) {
		return null;
	}
}
