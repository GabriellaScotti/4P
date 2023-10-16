import java.io.*;
public class QuozienteResto {

	public static void main(String[] args) throws IOException {
		//dati due numeri interi positivi o nulli, calcolare il quoziente e il resto della divisione intera
		//senza adoperare la divisione o moltiplicazione
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		int dividendo, divisore;
		int quoziente = 0;
		System.out.println("Inserisci due numeri interi, positivi o nulli, con cui fare la divisione ");
		System.out.println("Inserisci il primo numero ");
		dividendo = Integer.parseInt(stdin.readLine());
		System.out.println("Inserisci il secondo numero ");
		divisore = Integer.parseInt(stdin.readLine());
		
		if (dividendo==0 && divisore==0) {
			System.out.print("La divisione è indeterminata.");
			System.exit(-1);
		}
		if (divisore==0) {
			System.out.print("La divisione è impossibile.");
			System.exit(-1);
		}
		
		if(dividendo<0 || divisore<0) {
			System.out.print("Impossibile fare la divisione.");
			System.exit(0);
		}
		
        while (dividendo >= divisore) {
            dividendo -= divisore;
            quoziente++; 
        	}
        
        System.out.println("Il quoziente è " + quoziente);
        System.out.println("Il resto è " + dividendo);
		
	}

}
