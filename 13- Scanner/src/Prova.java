import java.util.Scanner;
public class Prova {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			//mettendo un numero che non 
			int x;
			int y = 0;
			
			// lo scanner prende solo il primo numero che inserisci, senza contare gli spazi
			while (sc.hasNextInt() == false) { //controlla se il prossimo numero è int e se è falso va avanti finché non ne trova uno
				sc.next(); //prende il prossimo valore inserito scartandolo
			}
			x = sc.nextInt();
			
			/*if(sc.hasNextInt()) {
			y = sc.nextInt();
			}*/
			
			System.out.println("La somma è " + (x+y));
		}
	}

}
