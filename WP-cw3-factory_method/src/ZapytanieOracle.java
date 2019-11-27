
public class ZapytanieOracle extends SzablonZapytania {

	public ZapytanieOracle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String formatujConnect() {
		System.out.println("Connect to  **Oracle**");
		return "Connect to  **Oracle**";
	}

	@Override
	public String formatujSelect(String zapytanie) {
		zapytanie=zapytanie+";";
		return zapytanie;
	}

	@Override
	public BazaDanych utworzBD() {
		// TODO Auto-generated method stub
		return new BazaDanychOracle();
	}

}
