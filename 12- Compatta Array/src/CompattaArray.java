import java.io.*;
public class CompattaArray {

	public static void compattaArray (int array[], int numero) {
		int i=0, j = array.length -1;
        for (i = 0; i <= j; i++) {
            if (array[i] == numero) {
                // Scambia l'elemento corrente con l'ultimo elemento
                int numerocorrente = array[i];
                array[i] = array[j];
                array[j] = numerocorrente;

                // Riduci j per evitare di toccare l'elemento appena spostato
                j--;
                // Decrementa i per riesaminare lo stesso indice dopo lo scambio
                i--;
            }
        }
		
        System.out.println("Array compattato: ");
        for(i=0; i<array.length; i++) {
        System.out.println((array[i]));
        }
}
	public static void main (String[] Args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("COMPATTAMENTO DI UN ARRAY");
		System.out.println("Inserisci quanti elementi vuoi nell'array");
		int n =Integer.parseInt(stdin.readLine());
		int array[]=new int [n];
		System.out.println("Inserisci i numeri dell'array");
		for (int i=0; i<array.length; i++) {
			array[i]=Integer.parseInt(stdin.readLine());
		}
		System.out.println("Array: ");
		for (int i=0; i<array.length; i++) {
		System.out.println(array[i]);
		}
		System.out.println("Inserisci il numero da mettere in coda ");
		int numero=Integer.parseInt(stdin.readLine());
		compattaArray(array, numero);
	}
}