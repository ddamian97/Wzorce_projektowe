
public abstract class SzablonZapytania {

	BazaDanych bd;
	public SzablonZapytania() {
		// TODO Auto-generated constructor stub
	}
	public void wykonajZapytanie(String specZapyt) {
		bd=utworzBD();
		String komendaDB;
		komendaDB = formatujConnect();
		//tutaj operacja polaczenia do bazy za pomoca komendaDB
		//,,,
		
		komendaDB=formatujSelect(specZapyt);
		
		//tutaj wykonanie za pomoca komendaDB
		bd.wykonajSelect(specZapyt);
	
		System.out.println(komendaDB);
	}
	public abstract String formatujConnect();
	public abstract String formatujSelect(String zapytanie);
	public abstract BazaDanych utworzBD();

}
