import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class LetturaStampaMatrice {

	public static void main(String[] args) throws IOException{
		//scriviamo la matrice in un file e facciamola leggere al programmma
		//dopo calcola la traccia della matrice quadrata (stesso numero di righe e stesso numero di colonne)
		//la traccia sarebbe la somma dei numeri sulla prima diagonale
		//poi calcola la somma della seconda diagonale
		
		Scanner sc = new Scanner(new File ("Dati Matrice"));
		
		int mat[][]; // si può anche fare tutto unito int mat [][] = new int [3][4];
		mat = new int [4][4];
		int somma=0;
		int sommaseconda=0;
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
        for (int i = 0; i<4; i++) {
            somma = somma + mat[i][i];
            sommaseconda = sommaseconda + mat[i][4-1-i];
        }
        
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("La somma dei numeri della traccia è: " + somma);
		System.out.println("La somma dei numeri della seconda diagonale è: " + sommaseconda);
	}

}
