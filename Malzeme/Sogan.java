package Malzeme;

import Enum.Bolluk;

public class Sogan implements Malzeme{
	Bolluk bolluk;
	public void bolluk(Bolluk bolluk) {
		this.bolluk = bolluk;
	}
	public float fiyat() {
		switch(bolluk) {
		case AZ:
			return (float) (0.5);
		case NORMAL:
			return 1;
		case BOL:
			return (float)(1.5);
		default:
			return 0;
		}
	}
}
