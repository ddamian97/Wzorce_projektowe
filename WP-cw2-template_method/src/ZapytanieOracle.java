
public class ZapytanieOracle extends SzablonZapytania {

	public ZapytanieOracle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String formatujConnect(String NazwaBD) {
		System.out.println("Connect to "+NazwaBD+" **Oracle**");
		return NazwaBD;
	}

	@Override
	public String formatujSelect(String zapytanie) {
		zapytanie=zapytanie+";";
		return zapytanie;
	}

}
