
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int GRAMMI_PER_CHILO = 1000;
		final int CENTIMETRI_PER_METRO = 100;
		
		int massa = 52000;
		int altezza = 160;
		
		//(double) casting cioè trasformare una variabile in un altro tipo
		double massaKg = ((double) massa) / GRAMMI_PER_CHILO;
		double altezzaM = ((double) altezza) / CENTIMETRI_PER_METRO;
		
		//body mass index
		double bmi = (massaKg / (altezzaM * altezzaM));
		
		
		System.out.println("Una persona con peso " + massaKg + "kg, ");
		System.out.println("altezza " + altezzaM + "m ");
		System.out.println("ha un BMI pari a " + Math.round(bmi));
		
		if(bmi < 18.5) {
			System.out.print("La persona è sottopeso.");}
		if (bmi > 25) {
			System.out.print("La persona è sovrappeso.");}
		else 
			System.out.print("La persona è normopeso.");
		
	}

}
