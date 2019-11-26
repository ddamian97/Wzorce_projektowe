
public abstract class SzablonZapytania {

	public SzablonZapytania() {
		// TODO Auto-generated constructor stub
	}
	public void wykonajZapytanie(String NazwaBD, String specZapyt) {
		String komendaDB;
		komendaDB = formatujConnect(NazwaBD);
		//tutaj operacja polaczenia do bazy za pomoca komendaDB
		//,,,
		
		komendaDB=formatujSelect(specZapyt);
		//tutaj wykonanie za pomoca komendaDB
		
		System.out.println(komendaDB);
	}
	public abstract String formatujConnect(String NazwaBD);
	public abstract String formatujSelect(String zapytanie);

}
