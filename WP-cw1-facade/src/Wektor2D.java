
public class Wektor2D {
	int x, y;

	private Wektor3D w32d1;
	public Wektor2D(int x, int y) {
		this.x=x;
		this.y=y;
		w32d1 = new Wektor3D(x, y, 0);		
	}
	
	public Wektor3D getWek3D() {
		return w32d1;
	}
	
	public void drukuj() {
		System.out.println("x= "+w32d1.x+" y= "+w32d1.y);

	}
	public Wektor2D dodaj2D(Wektor2D a, Wektor2D b) {
		
//		System.out.println("dodajem a.x "+a.x+" b.x "+b.x+" a.y "+a.y+" b.y "+b.y);

		Wektor3D a3 = new Wektor3D(a.x, a.y, 0);
		Wektor3D a4 = new Wektor3D(b.x,b.y,0);
//		System.out.println("a3.x "+a3.x+" a4.x "+a4.x+" a3.y "+a3.y+" a4.y "+a4.y);

		a3=a3.dodajWektor(a3,  a4);
		
		Wektor2D aa = new Wektor2D(a3.x, a3.y);

		return aa;
	}
	

}
