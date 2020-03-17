package Malzeme;

import Enum.Bolluk;

public class CheddarPeyniri implements Malzeme{
	Bolluk bolluk;

			public void bolluk(Bolluk bolluk) {
				this.bolluk = bolluk;
			}

			public float fiyat() {
				switch(bolluk) {
					case AZ:
						return 3;
					case NORMAL:
						return 6;
					case BOL:
						return 9;
					default:
						return 0;
		}
	}
}
