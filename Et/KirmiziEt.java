package Et;

import Enum.Adet;

public class KirmiziEt implements Et{
	Adet adet;
	public void adet(Adet adet) {
		this.adet = adet;
	}
	public int fiyat() {
		switch(adet) {
		case TEK:
			return 9;
		case DOUBLE:
			return 15;
		case TRIPLE:
			return 23;
		default: 
			return 0;
		}
	}
	
}
