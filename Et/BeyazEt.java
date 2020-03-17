
package Et;

import Enum.Adet;

public class BeyazEt implements Et{
	Adet adet;
	public void adet(Adet adet) {
		this.adet = adet;
	}
	public int fiyat() {
		switch(adet) {
		case TEK:
			return 7;
		case DOUBLE:
			return 13;
		case TRIPLE:
			return 19;
		default:
			return 0;
		}
	}
}
