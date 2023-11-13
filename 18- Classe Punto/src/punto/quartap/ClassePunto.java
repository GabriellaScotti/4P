package punto.quartap;
import java.lang.Math;
public class ClassePunto {
		private int x; 
		private int y;
		
		//Costruttore che accetta sia l'ascissa che l'ordinata del primo quadrante
		public ClassePunto (int a, int o){
			//versione con if innestati
			/*if (a < 0) {
				if (o < 0) {
					x=0;
					x=0;
			}
			else {
				x=0;
				y=o;
				}
			}
			else {
				x=a;
				if(o<0) {
					y=0;
				}
				else y=o;
			}*/
			
			//versione con if normali
			x=a;
			y=o;
			
			/*if(a<0)
				x=0;
			if(o<0)
				y=0;*/
		}
		
		//Costruttore che accetta solo l'ascissa (mentre l'ordinata la mette a zero)
		//Costruttore che accetta solo l'ordinata (mentre l'ascissa la mette a zero)
		//usando un parametro char per fare una scelta di quale cordinata prendere
		public ClassePunto (int c, char t){
			if(t=='a') {
			x=c;
			y=0;
			}
			else{
			x=0;
			y=c;
			}
		}
		
		//I metodi getter e setter
		//imposta (set) il valore di una variabile
		//restituisce (get) il valore di una variabile
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		//i setter devono controllare se il valore è del primo quadrante
		public void setX (int a) {
			if(a>0)
			x=a;
		}
		
		public void setY (int o) {
			if(o>0)
			y=o;
		}
		
		//Metodo di stampa
		public String toString () {
			return "Punto("+ x + "," + y + ")";
		}
		
		//Metodo del calcolo della distanza tra due punti
		//possiamo dare come parametro un punto di tipo ClassePunto e poi usare i getter
		//prendiamo un solo punto perchè abbiamo già costruito l'altro
		public double distanza (ClassePunto p2) {	
			return Math.sqrt(Math.pow(this.x - p2.getX(), 2) + Math.pow(this.y - p2.getY(), 2));
		}
		
		//Metodi che calcola la distanza statica dei punti
		public static double distanza (ClassePunto p1, ClassePunto p2) {
			return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
		}
		
		//Metodi che calcolano i simmetrici dei punti
		public ClassePunto simmetricoX () {
			/*ClassePunto p = new Punto (x, -y);
			  return p
			 */
			return new ClassePunto (x, -y);
		}
		
		//Metodo equals che stabilisce se due punti sono uguali
		public boolean equals (ClassePunto p2) {
			if(this.x == p2.getX() && this.y == p2.getY()) {
				return true;
			}
				return false;
				
		}

}

