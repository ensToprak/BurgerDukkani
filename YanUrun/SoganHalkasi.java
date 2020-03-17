package YanUrun;

import Enum.Boy;

public class SoganHalkasi implements YanUrun{
	Boy boy;
	
	public void boy(Boy boy) {
		this.boy = boy;
	}
	
	public float fiyat() {
		switch(boy) {
		case KUCUK:
			return 4;
		case ORTA:
			return 6;
		case BUYUK:
			return 8;
		default:
			return 0;
		}
	}
}
