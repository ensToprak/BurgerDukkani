package Icecek;

import Enum.Litre;

public class Ayran implements Icecek{
	Litre litre;
	
	public void litre(Litre litre) {
		this.litre = litre;
	}
	
	public float fiyat() {
		switch(litre) {
		case YOK:
			return 0;
		case L_02:
			return (float)(2.5);
		case L_033:
			return (float)(3.5);
		case L_1:
			return 6;
		default:
			return 0;
		}
	} 
}
