package libro.quartap;

public class Libro {
		//attributi
		private String titolo;
		private String autore;
		private int numeroPagine;
		static private final double costoPerPagina = 0.1;
		static private final double costoFisso = 2.0;
		
		//Costruttore di default
		public Libro () {
			titolo = "I Promessi Sposi";
			autore = "A. Mazoni";
			numeroPagine = 300;
		}
		
		//Costruttore completo che accetta come parametri titolo, autore e numero di pagine
		public Libro (String titolo, String autore, int numeroPagine){
			this.titolo = titolo;
			this.autore = autore;
			this.numeroPagine = numeroPagine;
		}
		
		//Realizzare i metodi Getter e setter.
		//Realizziamo solo i metodi getter perchè quelli setter non ci servono dato che gli attributi saranno sempre uguali per il libro
		public String getTitolo() {
			return titolo;
		}
		
		public String getAuotore() {
			return autore;
		}
		public int getNumeroPagine() {
			return numeroPagine;
		}
		
		//Realizzare il metodo to_string che stampa una stringa con le informazioni del libro:
		public String toString () {
			return "Titolo: " + titolo + "\n" + "Autore: " + autore + "\n" + "Numero Pagine: " + numeroPagine + "\n" + "Prezzo: " + prezzo();
		}
		
		//Realizzare un costruttore di copia
		public Libro (Libro l) {
			this.titolo = l.titolo;
			this.autore = l.autore;
			this.numeroPagine = l.numeroPagine;
		}
		
		//Realizzare il metodo prezzo che calcola il prezzo del libro
		private double prezzo () {
			return costoFisso + costoPerPagina * numeroPagine;
		}

}
