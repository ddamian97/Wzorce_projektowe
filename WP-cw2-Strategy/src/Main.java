
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		double mleczko = 2.43;
		double makaron = 5;
		double pasztecik = 15;
		double maselko=8;
		double tablica1[] = {mleczko, makaron, pasztecik, maselko};
		
		Zamowienie zamowienie1 = new Zamowienie(tablica1, 1);
		zamowienie1.obliczPodatek();
		Zamowienie zamowienie2 = new Zamowienie(tablica1, 2);
		zamowienie2.obliczPodatek();
		
		System.out.println();
		System.out.println();
		
		double tablica2[] = {mleczko, makaron, pasztecik, maselko, 14};
		Zamowienie zamowienie3 = new Zamowienie(tablica2, 1);
		zamowienie3.obliczPodatek();
		Zamowienie zamowienie4 = new Zamowienie(tablica2, 2);
		zamowienie4.obliczPodatek();
	}

}
