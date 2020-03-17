package Malzeme;

import Enum.Bolluk;

public class Marul implements Malzeme{
	Bolluk bolluk;
	public void bolluk(Bolluk bolluk) {
		this.bolluk = bolluk;
	}
	public float fiyat() {
		switch(bolluk) {
		case AZ:
			return (float) (0.25);
		case NORMAL:
			return (float)(0.5);
		case BOL:
			return (float)(0.75);
		default:
			return 0;
		}
	}
}
