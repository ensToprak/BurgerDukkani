package Factory;
import Et.Et;
import Icecek.Icecek;
import Malzeme.Malzeme;
import Sos.Aci;
import Sos.Barbeku;
import Sos.Hardal;
import Sos.Ketcap;
import Sos.Mayonez;
import Sos.Sos;
import Tatli.Tatli;
import YanUrun.YanUrun;

public class SosFactory extends BurgerMenuFactory{
	public Et getEt(int etSecimi) {
		return null;
	}
	public Malzeme getMalzeme(int malzemeSecimi) {
		return null;
	}
	public Sos getSos(int sosSecimi) {
		switch(sosSecimi) {
		case 1:
			return new Mayonez();
		case 2:
			return new Ketcap();
		case 3:
			return new Barbeku();
		case 4:
			return new Hardal();
		case 5:
			return new Aci();
		default:
			return null;
		}
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
