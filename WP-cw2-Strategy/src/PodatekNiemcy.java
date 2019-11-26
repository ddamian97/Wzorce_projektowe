
public class PodatekNiemcy extends ObliczPodatek {

	double suma=0, podatek=0.12, tmp=0;
	public PodatekNiemcy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double kwotaPodatku(double[] tablica) {
		// TODO Auto-generated method stub
		for(int i=0; i<tablica.length; i++) {
			suma+=tablica[i];
		}
		tmp=suma;
		System.out.println("Suma cen netto Niemcy: "+suma);
		suma=(tmp*podatek)+suma;
		System.out.println("Niemcy:");
		return suma;
	}
	

}
