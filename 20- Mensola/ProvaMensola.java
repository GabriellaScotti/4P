package mensola.quartap;

import libro.quartap.Libro;

public class ProvaMensola {

	public static void main(String[] args) {
		Mensola m = new Mensola();
		
		Libro l1 = new Libro("Divina Commedia", "Dante Alighieri", 700);
		
		
		m.setVolume(l1, 3);
		
		m.setVolume(new Libro("Foundation", "Asimov", 700), 1);
		
		m.setVolume(new Libro(), 5);
		
		//l1.setTitolo("Commedia");
		
		//m.rimuoviVolume(5);
		
		System.out.print(m);
		
		

	}

}
