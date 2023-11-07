import java.util.Arrays; //importa la libreria per usare i metodi di arrays
import java.util.Comparator;
public class Prova {

	public static void main(String[] args) {
		int [] v = new int [] {4, 9, 8, 1, 15, 39, 54, 26}; //creiamo un array
		int [] v2 = new int [] {4, 9, 8, 1, 15, 39, 54, 26}; //creiamo un secondo array per compararlo al primo
		Integer [] v3 = new Integer [] {4, 9, 8, 1, 15, 39, 54, 26};
		//adesso ordiniamo l'array con uno dei suoi metodi
		//usiamo un "sort" il più semplice
		
		System.out.println(Arrays.equals(v, v2));//metodo per controllare true o flase se due array sono uguali
		
		Arrays.sort(v); //un metodo per ordinare un array di int in modo crescente usando un sottoprogramma
		
		System.out.println(Arrays.toString(v)); //stampa l'array come un elemento intero e non numero per numero
		//mette di default spazi e parentesi quadre
		
		System.out.println(Arrays.binarySearch(v, 15)); //controlla nell'array ordinato se esiste un numero e ti restituisce la posizione
		//se il numero non esiste nell'array ti restituisce un valore negativo
		
		//per fare l'ordine decrescente dell'array
		
		Arrays.sort (v3, new Comparator <Integer>() {
			
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}});
		
		System.out.println(Arrays.toString(v3));
		
		Arrays.sort(v3);
		System.out.print(Arrays.toString(v3));
	}
	public static void sort (int []a ) {} //il sottoprogramma che fa funzionare il metodo
	//non dobbiamo fare niente perchè il codice è già fatto da java

}
