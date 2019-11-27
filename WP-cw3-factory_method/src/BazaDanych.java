
public abstract class BazaDanych {
	
//	int wybor;
//	public BazaDanych(int wybor) {
//		this.wybor=wybor;
//	}
	public BazaDanych() {};
	
//	public BazaDanych DoMakeBazaDanych(){
//		if (wybor==1) {
//			return new BazaDanychSQLServer();
//		}
//		else {
//			return new BazaDanychOracle();
//		}
//	}
//	

	public abstract void wykonajSelect(String specZapyt);
	
	

}
