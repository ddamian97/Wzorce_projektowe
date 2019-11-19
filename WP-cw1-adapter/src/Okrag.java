
public class Okrag extends Figura {

	public static XXOkrag xxokrag;
	public Okrag() {
		// TODO Auto-generated constructor stub
		System.out.println("Nowy okrag");
		xxokrag = new XXOkrag();

	}

	@Override
	public void wyswietl() {
		xxokrag.wyswietlaj();
		
	}


}
