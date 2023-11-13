package it.quartap;
//classe Punto con y tra -10 e 10
//creaiao una classe Punto aggiungendo ad esso delle funzionalità che richiameremo in un'altra classe
public class Punto {
	// con private, al di fuori della classe che stiamo creando, le vaariabili non saranno accessibili
	private int x; 
	public int y;

	//Costruttore
	//creiamo un sottoprogramma che crei un oggetto della classe punto
	//non c'è bisogno di scrivere il tipo dell'oggetto perché il programma già sa che è un oggetto della classe tipo 
	public Punto (int a, int o){
		x=a;
		y=o;
	}
	
	//Costruttore di default
	//creaiamo un punto di default senza chiedere niente all'utente con un altro metodo costruttore
	//questa è una classe costruttore uguale alla precedente, non si creerà un overflow ma un polimorfismo
	public Punto() {
		x = 0;
		y = 0;
	}
	
	//metodi getter
	//per convenzione si scrive in inglese e con Camel Case
	//get significa "ottenere" la variabile che ci serve
	//in questo caso si mette il tipo int perché è quello che deve darci in uscita 
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	//metodi setter
	//set significa "impostare" la variabile che ci serve
	public void setX (int a) {
		x=a;
	}
	
	public void setY (int o) {
		//if (o > -10 && o < 10) 
			y=o;
	}
	
	//per ottenere una stringa che ci descrivi le informazioni su tutte le variabili
	public String toString () {
		return "Punto("+ x + "," + y + ")";
	}
	
}
