import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CambioPrimoNome2 {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		int n, i; 
		
		System.out.println("Inserisci quanti nomi che vuoi inserire ");
		n = Integer.parseInt(stdin.readLine());
		
		String primoArray[] = new String [n];
		String secondoArray[] = new String [n];
		
		for (i=0; i<primoArray.length; i++) {
			System.out.print("Inserisci il " + (i+1) + " nome ");
			primoArray[i] = stdin.readLine();
			secondoArray[i] = primoArray[i].trim();
			
			if (secondoArray[i].substring(0, 4).equalsIgnoreCase("anna")) {
				secondoArray[i]= "Maria" + secondoArray[i].substring(4);
				secondoArray[i] = secondoArray[i].replaceAll(" ", "");
			}
			
		}
		for (i=0; i<secondoArray.length; i++) {
		System.out.print("Il " + (i+1) + " nome diventa: ");
		System.out.println(secondoArray[i]);
		}
	}
}
