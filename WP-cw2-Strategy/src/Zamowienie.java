
public class Zamowienie {

	double[] towary;
	int kraj;
	Konfiguracja k1;
	ObliczPodatek op1;
	public Zamowienie(double towary[], int kraj) {
		// TODO Auto-generated constructor stub
		this.towary=towary;
		this.kraj = kraj;
	}

	public void obliczPodatek() {
		k1 = new Konfiguracja();
		op1=k1.kraj(kraj);
		System.out.println(op1.kwotaPodatku(towary));
	}
}
