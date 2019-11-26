
public class PodatekPolska extends ObliczPodatek {

	double podatek=12, suma=0;
	public PodatekPolska() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double kwotaPodatku(double[] tablica) {
		for(int i=0; i<tablica.length; i++) {
			suma+=tablica[i];
		}
		System.out.println("Suma cen netto Polska: "+suma);
		System.out.println("Polska:");
		return (suma+podatek);
	}
	

}
