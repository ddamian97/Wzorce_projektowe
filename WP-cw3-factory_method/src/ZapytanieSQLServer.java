
public class ZapytanieSQLServer extends SzablonZapytania {

	public ZapytanieSQLServer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String formatujConnect() {
		System.out.println("Connect to **SQLServer**");
		
		return "Connect to **SQLServer**";
	}

	@Override
	public String formatujSelect(String zapytanie) {
		// TODO Auto-generated method stub
		return zapytanie;
	}

	@Override
	public BazaDanych utworzBD() {
		// TODO Auto-generated method stub
		return new BazaDanychSQLServer();
	}

}
