
public class ZapytanieSQLServer extends SzablonZapytania {

	public ZapytanieSQLServer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String formatujConnect(String NazwaBD) {
		System.out.println("Connect to "+NazwaBD+" **SQLServer**");
		
		return NazwaBD;
	}

	@Override
	public String formatujSelect(String zapytanie) {
		// TODO Auto-generated method stub
		return zapytanie;
	}

}
