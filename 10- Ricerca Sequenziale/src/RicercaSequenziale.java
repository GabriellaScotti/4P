import java.io.*;

public class RicercaSequenziale {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
        int posizione = -1;
        
        System.out.println("Inserisci i caratteri");
        String caratteri = stdin.readLine().trim();
        char vettore[] = new char[caratteri.length()];
        for (int i = 0; i < caratteri.length(); i++) {
        	vettore[i] = caratteri.charAt(i);
        }
        
        for (int i = 0; i < caratteri.length(); i++) {
        	System.out.println(vettore[i]);
        }
        
        System.out.println("Inserisci un carattere da controllare nel vettore ");
        String car = stdin.readLine();
        char carattere = car.charAt(0);
        
        for (int i = 0; i < caratteri.length(); i++) {
        	if(caratteri.charAt(i)==carattere) {
        		posizione=i;
        	}
        }
        
        /*for (int i = 0; i < vettore.length; i++) {
            if (vettore[i] == carattere) {
                posizione=i;
                }
            }
            */
        
        if(posizione==-1) {
        System.out.print("Il carattere non si trova nel vettore");}
        else {System.out.print("Il carattere si trova nel vettore in posizione " + (posizione+1));}
        }
}