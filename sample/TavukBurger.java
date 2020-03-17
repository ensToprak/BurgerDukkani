package sample;
import Et.Et;
import Factory.UrunSecim;
import Enum.*;
import Factory.BurgerMenuFactory;
import Malzeme.Malzeme;
public class TavukBurger implements Menu{
    float fiyat;

    public float menu() {
        BurgerMenuFactory etFactory = UrunSecim.getFactory(1);

        Et et = etFactory.getEt(1);
        et.adet(Adet.TEK);
        fiyat += et.fiyat();

        BurgerMenuFactory malzemeFactory = UrunSecim.getFactory(2);

        Malzeme malzeme2 = malzemeFactory.getMalzeme(2);
        malzeme2.bolluk(Bolluk.AZ);
        fiyat += malzeme2.fiyat();
        Malzeme malzeme3 = malzemeFactory.getMalzeme(3);
        malzeme3.bolluk(Bolluk.AZ);
        fiyat += malzeme3.fiyat();
        Malzeme malzeme4 = malzemeFactory.getMalzeme(4);
        malzeme4.bolluk(Bolluk.AZ);
        fiyat += malzeme4.fiyat();

        return fiyat;
    }

    public void et(int etSecim, int etM) {}
    public void malzeme(int malzemeSecim, int malzemeM) {}
    public void sos(int sosSecim, int sosM){}
    public void icecek(int icecekSecim, int icecekM){}
    public void yanUrun(int yanUrunSecim, int yanUrunM){}
    public void tatli(int tatliSecim, int tatliM){}
}