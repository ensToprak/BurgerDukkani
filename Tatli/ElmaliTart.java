package Tatli;

import Enum.Secim;

public class ElmaliTart implements Tatli{
	Secim secim;
	
	public void secim(Secim secim) {
		this.secim = secim;
	}
	
	public float fiyat() {
		switch(secim) {
		case BIR:
			return 6;
		case IKI:
			return 12;
		case UC:
			return 18;
		default:
			return 0;
		}
	}
}
