package mensola.quartap;

import libro.quartap.Libro;

public class Mensola {
	
	Libro[] m;
	
	static final int MAX_NUM_LIBRI_MENSOLA = 15; 
	
	public Mensola() {
		m = new Libro[10];
	}
	
	//Costruttore
	public Mensola(int nLibri) {
		if (nLibri >0 && nLibri <=15)
			m = new Libro[nLibri];
		else {
			m = new Libro[10];
		}
	}
	
	
	
	public int setVolume(Libro l, int posizione) {
		if (posizione <=0 || posizione > m.length)
			return -1;
		if(m[posizione] != null)
			return -2;
		
		m[posizione-1] = new Libro(l);
		return 0;
		
	}
	
	public Libro getVolume(int posizione) {
		if (posizione>0 && posizione <= m.length && m[posizione-1] != null) {
			return m[posizione-1];
		}
		return null;
	}
	
	public String toString() {
		String s ="";
		for(int i =0; i < m.length; i++) {
			if(m[i] != null)
				s += (i+1) + ")" + m[i].toString() + "\n";
		}
		return s;
	}
	
	public int rimuoviVolume(int posizione ) {
		if (posizione < 1 || posizione > m.length) 
			return -1;
		if (m[posizione-1] == null)
			return -2;
		m[posizione-1] = null;
		return posizione;
		
	}
	

	
	

}
