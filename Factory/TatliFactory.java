package Factory;
import Et.Et;
import Icecek.Icecek;
import Malzeme.Malzeme;
import Sos.Sos;
import Tatli.ElmaliTart;
import Tatli.Suffle;
import Tatli.Tatli;
import YanUrun.YanUrun;

public class TatliFactory extends BurgerMenuFactory{
	public Et getEt(int etSecimi) {
		return null;
	}
	public Malzeme getMalzeme(int malzemeSecimi) {
		return null;
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
		switch(tatliSecimi) {
		case 1:
			return new Suffle();
		case 2:
			return new ElmaliTart();
		default:
			return null;
		}
	}
}
