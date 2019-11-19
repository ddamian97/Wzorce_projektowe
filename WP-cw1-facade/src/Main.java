
public class Main {

	public static void main(String[] args) {
		Wektor3D w3d1 = new Wektor3D(1,  2,  3);
		w3d1.drukuj();
		Wektor3D w3d2 = new Wektor3D(1,  2,  3);
		w3d2.drukuj();
		Wektor3D w3d3 = new Wektor3D(3,  4,  5);
		w3d3.drukuj();
		Wektor2D w2d1 = new Wektor2D(1,  2);
		w2d1.drukuj();
		Wektor2D w2d2 = new Wektor2D(5,  5);
		w2d2.drukuj();
		Wektor2D w2d3 = new Wektor2D(9,  9);
		w2d3.drukuj();

		
		System.out.println();
		
		w3d3=w3d3.dodajWektor(w3d1, w3d2);
		w3d3.drukuj();

		System.out.println();
		
		w2d2=w2d2.dodaj2D(w2d3, w2d1);
		w2d2.drukuj();
		
		System.out.println();
		
		w2d1=w2d1.dodaj2D(w2d2, w2d3);
		w2d1.drukuj();
		
		System.out.println();
		
		w2d2=w2d2.dodaj2D(w2d3, w2d1);
		w2d2.drukuj();

	}


}
