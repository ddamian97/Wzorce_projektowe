
public class Konfiguracja {

	public Konfiguracja() {
		// TODO Auto-generated constructor stub
	}
	public ObliczPodatek kraj(int wybor) {
		if(wybor==1) {
			ObliczPodatek pp = new PodatekPolska();
			
			return pp;
		}
		else {
			ObliczPodatek pn = new PodatekNiemcy();
			return pn;
		}
	}

}
