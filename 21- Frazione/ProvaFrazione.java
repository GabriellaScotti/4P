
public class ProvaFrazione {

	public static void main(String[] args) {
		Frazione f1 = new Frazione (1);
		Frazione f2 = new Frazione (1, 12);
		Frazione f = new Frazione (18, 72);
		
		f1.setDenominatore(6);
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		
		System.out.println(f1.Somma(f2));
		System.out.println(f1.Sottrazione(f2));
		System.out.println(f1.Prodotto(f2));
		System.out.println(f1.Sottrazione(f2));
		
		System.out.print(f.Riduzione());

	}

}
