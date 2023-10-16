import java.io.*;
public class MediaPrimi {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		/*
		// con array
		int interi[], i = 0;
		int maxdim = 1000;
		interi = new int[maxdim];
		*/
		
		int i = 0, somma = 0;
		System.out.print("Inserisci quanti numeri vuoi calcolare ");
		int numeri= Integer.parseInt(stdin.readLine());
		//i numeri interi sono numeri positivi o negativi senza virgola
		System.out.print("Inserisci i numeri interi ");
		for (i = 0; i<numeri; i++) {
			int interi = Integer.parseInt(stdin.readLine());
			if (interi>0)
			somma+=interi;
			else if (interi<0) 
				System.out.println("Il numero è negativo e non sarà calcolato nella media ");
				}
		
		double media = (double)somma / numeri;
		System.out.print("La media dei numeri inseriti è " + media);
	}

}
