package punto.quartap;

public class Punti {

		public static void main(String[] args) {
			ClassePunto p, p2;
			p = new ClassePunto (1, 1);
			p2 = new ClassePunto (0, 0);
			
			System.out.println(p);
			
			System.out.println(p2);
			
			System.out.println("La distanza fra i due punti è " + p.distanza(p2));
			
			//System.out.println(ClassePunto.distanza(p, p2));
			
			System.out.println("I due punti sono uguali?");
			System.out.println(p.equals(p2));
			
			System.out.println("Simmetrico del punto:");
			System.out.println(p.simmetricoX());

	}

}
