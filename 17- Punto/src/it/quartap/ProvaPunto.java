package it.quartap;

public class ProvaPunto {

	//creiamo un'altra classe all'interno dello stesso pacchetto it.quartap 
	//che usi la classe Punto e tutte le funzionalità che gli abbiamo dato
	public static void main(String[] args) {
		Punto p;
		p = new Punto (3, 2); //gli passiamo due valori che saranno l'ascissa x e l'ordinata y dell'altra classe
		Punto p2 = new Punto ();//dato che non abbiamo dato nessun valore a p2, prenderà il valore di default
		
		//set significa che porremmo una varibile al numero che vogliamo
		//adesso il punto cambierà e sarà (3, 5)
		//p.setY(5);
		
		//possiamo anche agire e cambiare direttamente la struttura della classe mettendo public int alla variabile
		//spetta al programmatore indicare che le variabili della struttura sono private
		p.y = 5;
		
		System.out.println(p);
		System.out.print(p2);

	}

}
