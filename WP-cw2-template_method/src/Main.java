
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SzablonZapytania szablon1 = new ZapytanieSQLServer();
		SzablonZapytania szablon2 = new ZapytanieOracle();
		
		String SQLServer = "SQLServerdb1";
		String Oracle = "oracledb1";
		
		String specZapyt = "Select * from tab1";
		
		szablon1.wykonajZapytanie(Oracle, specZapyt);
		szablon2.wykonajZapytanie(SQLServer, specZapyt);
	}
}
