package Factory;
import Et.Et;
import Icecek.Icecek;
import Malzeme.Malzeme;
import Sos.Sos;
import Tatli.Tatli;
import YanUrun.YanUrun;

public abstract class BurgerMenuFactory {
	public abstract Et getEt(int etSecimi);
	public abstract Malzeme getMalzeme(int malzemeSecimi);
	public abstract YanUrun getYanUrun(int yanUrunSecimi);
	public abstract Sos getSos(int sosSecim);
	public abstract Tatli getTatli(int tatliSecim);
	public abstract Icecek getIcecek(int icecekSecim);
}
