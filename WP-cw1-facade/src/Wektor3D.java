
public class Wektor3D {
	int x, y, z;
	public Wektor3D(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public void drukuj() {
		System.out.println("x= "+x+" y= "+y+ " z= "+z);

	}
	public Wektor3D dodajWektor(Wektor3D a, Wektor3D b) {
//		Wektor3D wd3d = new Wektor3D((a.x+b.x), (a.y+b.y), (a.z+b.z));
		Wektor3D wd3d = new Wektor3D((a.x+b.x), (a.y+b.y), (a.z+b.z));

		return wd3d;

	}
}
