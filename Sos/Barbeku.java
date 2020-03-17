package Sos;

import Enum.Miktar;

public class Barbeku implements Sos{
	Miktar miktar;
	
	public void miktar(Miktar miktar) {
		this.miktar = miktar;
	}
	
	public float fiyat() {
		switch(miktar) {
		case BIRPAKET:
			return (float)(0.25);
		case IKIPAKET:
			return (float)(0.5);
		case UCPAKET:
			return (float)(0.7);
		default:
			return 0;
		}
		
	}
}
