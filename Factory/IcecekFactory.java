package Factory;
import Et.Et;
import Icecek.Ayran;
import Icecek.Fanta;
import Icecek.Icecek;
import Icecek.Kola;
import Icecek.SogukCay;
import Icecek.Sprite;
import Malzeme.Malzeme;
import Sos.Sos;
import Tatli.Tatli;
import YanUrun.YanUrun;

public class IcecekFactory extends BurgerMenuFactory{
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
		switch(icecekSecimi) {
		case 1:
			return new Kola();
		case 2:
			return new Fanta();
		case 3:
			return new SogukCay();
		case 4:
			return new Sprite();
		case 5:
			return new Ayran();
		default:
			return null;
		}
	}
	public YanUrun getYanUrun(int yanUrunSecimi) {
		return null;
	}
	public Tatli getTatli(int tatliSecimi) {
		return null;
	}
}
