package Sos;

import Enum.Miktar;

public class Aci implements Sos{
	Miktar miktar;
	
	public void miktar(Miktar miktar) {
		this.miktar = miktar;
	}
	
	public float fiyat() {
		switch(miktar) {
		case BIRPAKET:
			return 0;
		case IKIPAKET:
			return (float)(0.25);
		case UCPAKET:
			return (float)(0.5);
		default:
			return 0;
		}
		
	}
}

