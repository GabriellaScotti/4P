import java.io.*;

public class RicercaSequenziale {

	public static void main(String[] args) throws IOException {
        char vettore [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
			 
        for (int i = 0; i < vettore.length; i++) {
        	System.out.println (vettore[i]);
        }
        
        System.out.print("Inserisci il carattere da cercare nel vettore: ");
        char carattere = (char)System.in.read();
        int pos=-1;
        
        for (int i = 0; i < vettore.length; i++) {
            if (vettore[i] == carattere) {
                pos=i;
                break;
            }
        }
        
        if (pos==-1) {
            System.out.println("Il carattere " + carattere + " non è presente nel vettore.");
        } else {
            System.out.println("Il carattere " + carattere + " è presente nel vettore alla posizione: " + pos + ".");
        }
    }
	}