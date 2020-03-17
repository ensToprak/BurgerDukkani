package Factory;
import Et.BeyazEt;
import Et.Et;
import Et.KirmiziEt;
import Icecek.Icecek;
import Malzeme.Malzeme;
import Sos.Sos;
import Tatli.Tatli;
import YanUrun.YanUrun;

public class EtFactory extends BurgerMenuFactory{
	public Et getEt(int etSecimi) {
		switch(etSecimi) {
		case 1:
			return new BeyazEt();
		case 2:
			return new KirmiziEt();
		default:
			return null;
		}
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
		return null;
	}
}
