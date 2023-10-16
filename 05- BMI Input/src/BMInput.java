//per inserire un input bisogna aggiungere una nuova classe 
import java.io.*;

public class BMInput {

	//Aggiungere prima della parentesi graffa di apertura di main il lancio dell’eccezione I/O
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Inserisci l'altezza in centimetri ");
		int altezza = Integer.parseInt(stdin.readLine());
		System.out.print("Inserisci il peso in grammi ");
		int peso = Integer.parseInt(stdin.readLine());
		double altezzaInMetri= (double) altezza/100;
		double pesoInKg = (double) peso/1000;
		
		//body mass index
		double bmi = (pesoInKg / (altezzaInMetri * altezzaInMetri));
		
		System.out.println("Una persona con peso " + pesoInKg + "kg, ");
		System.out.println("altezza " + altezzaInMetri + "m ");
		System.out.println("ha un BMI pari a " + Math.round(bmi));
		
		if(bmi < 18.5) {
			System.out.print("La persona è sottopeso.");}
		if (bmi > 25) {
			System.out.print("La persona è sovrappeso.");}
		else 
			System.out.print("La persona è normopeso.");
		
	}

}
