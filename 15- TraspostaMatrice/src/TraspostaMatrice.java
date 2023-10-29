import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class TraspostaMatrice {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		// data una matrice, fare la sua trasposta
		// la trasposta significa far diventare le righe colonne
		// crea due matrici e inverti la i con la j
		
		Scanner sc = new Scanner(new File ("Matrice Trasposta"));
		
		System.out.println("Inserisci il numero di righe");
		int r = Integer.parseInt(stdin.readLine());
		System.out.println("Inserisci il numero di colonne");
		int c = Integer.parseInt(stdin.readLine());
		int matrice [][] = new int [r][c];
		int matricetrasposta [][] = new int [c][r];

		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				matrice[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrice");
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				matricetrasposta[j][i] = matrice[i][j]; 
			}
		}
		System.out.println("Matrice Trasposta");
		for (int i=0; i<c; i++) {
			for (int j=0; j<r; j++) {
				System.out.print(matricetrasposta[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
