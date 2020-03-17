package Factory;

import Et.Et;
import Icecek.Icecek;
import Malzeme.Malzeme;
import Sos.Sos;
import Tatli.Tatli;
import YanUrun.Patates;
import YanUrun.SoganHalkasi;
import YanUrun.TavukBaget;
import YanUrun.YanUrun;

public class YanUrunFactory extends BurgerMenuFactory{
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
		switch(yanUrunSecimi) {
		case 1:
			return new Patates();
		case 2:
			return new SoganHalkasi();
		case 3:
			return new TavukBaget();
		default:
			return null;
		}
	}
	public Tatli getTatli(int tatliSecimi) {
		return null;
	}
}
