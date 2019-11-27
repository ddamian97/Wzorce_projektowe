
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BazaDanych bd1 = new BazaDanychSQLServer();
		BazaDanych bd2 = new BazaDanychOracle();
		SzablonZapytania szablon1 = new ZapytanieSQLServer();
		SzablonZapytania szablon2 = new ZapytanieOracle();
		
		String SQLServer = "SQLServerdb1";
		String Oracle = "Oracledb1";
		
		String specZapyt = "Select imie, nazwisko, placa from tab1 where imie like 'd%'";
		
		szablon1.wykonajZapytanie(specZapyt);
		
		System.out.println();
		
		szablon2.wykonajZapytanie(specZapyt);
	}
}
