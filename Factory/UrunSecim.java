package Factory;
public class UrunSecim {
	public static BurgerMenuFactory getFactory(int urunSecim) {
		switch(urunSecim) {
		case 1:
			return new EtFactory();
		case 2:
			return new MalzemeFactory();
		case 3:
			return new SosFactory();
		case 4:
			return new IcecekFactory();
		case 5:
			return new YanUrunFactory();
		case 6:
			return new TatliFactory();
		default:
			return null;
		}
	}
}
