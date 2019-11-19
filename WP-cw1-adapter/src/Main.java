
public class Main {

	public static void main(String[] args) {

		Figura okrag = new Okrag();
		Figura linia = new Linia();
		
		Figura tabFigury[] = {
				okrag, 
				linia
		};
		
		for(int i=0; i<tabFigury.length; i++) {
			tabFigury[i].wyswietl();
		}
	}

}
