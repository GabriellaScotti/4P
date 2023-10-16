import java.io.*;
public class ArrayStringa {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		int n, i=0;
		System.out.println("Inserisci il numero di stringhe: ");
		n= Integer.parseInt(stdin.readLine());
		
		String s[]= new String [n];
		
		for (i=0; i<s.length; i++) {
			System.out.print("Inserisci la stringa numero " + (i+1) + " ");
			s[i] = stdin.readLine();
		}
		
		System.out.println("**********STAMPA**********");
		for (i=0; i<s.length; i++) {
		System.out.print("Stringa numero " + (i+1) + " ");
		System.out.println(s[i]);
		}
		
	}

}