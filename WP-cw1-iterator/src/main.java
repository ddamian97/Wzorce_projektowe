
public class main {

	public static void main(String[] args) {

		int[] tablica = new int[10];							
		
		
		TableToIterate t1 = new TableToIterate(tablica);
		t1.wr1();
		int[] tablica2 = t1.getTab();
		
		iterator1 it1 = new iterator1(tablica2);
		
		iterator2 it2 = new iterator2(tablica2);
		
		t1.It1CurrentItem();
		t1.It2CurrentItem();
		
		t1.It1Next();
		t1.It2Next();
		
		t1.It1First();
		t1.It2First();
		
		t1.It1IsDone();
		t1.It2IsDone();
		
		t1.It1Next();
		t1.It2Next();
		
		t1.It1Next();
		t1.It2Next();
		
		t1.It1Next();
		t1.It2Next();
		
		t1.It1Next();
		t1.It2Next();
		
		t1.It1CurrentItem();
		t1.It2CurrentItem();
}

}
