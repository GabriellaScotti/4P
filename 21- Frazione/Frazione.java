
public class Frazione {
		public int numeratore;
		public int denominatore;
		
		public Frazione (int num, int den) {
			numeratore = num;
			denominatore = den;
		}
		
		public Frazione (int num) {
			numeratore = num;
			denominatore = 1;
		}
		
		public int getNumeratore () {
			return numeratore;
		}
		
		public int getDenominatore () {
			return denominatore;
		}
		
		public void setNumeratore (int n) {
			numeratore = n;
		}
		
		public void setDenominatore (int d) {
			denominatore = d;
		}
		
		public String toString () {
			return "Frazione: " + numeratore + "/" + denominatore;
			
		}
		
		public String Somma (Frazione f2) {
			int den = f2.denominatore * this.denominatore;
			int num = ((den/f2.denominatore) * f2.numeratore) + ((den/this.denominatore) * this.numeratore);
			return "Somma frazioni: " + num + "/" + den;
		}
		
		public String Sottrazione (Frazione f2) {
			int den = f2.denominatore * this.denominatore;
			int num = ((den/f2.denominatore) * f2.numeratore) - ((den/this.denominatore) * this.numeratore);
			return "Sottrazione frazioni: " + num + "/" + den;
		}
		
		public String Prodotto (Frazione f2) {
			int den = f2.denominatore * this.denominatore;
			int num = f2.numeratore * this.numeratore;
			return "Prodotto frazioni: " + num + "/" + den;
		}
		
		public String Divisione (Frazione f2) {
			int den = f2.denominatore * this.numeratore;
			int num = f2.numeratore * this.denominatore;
			return "Divisione frazioni: " + num + "/" + den;
		}
		
	    public static int MCD(int a, int b) {
	        if (b == 0) {
	            return a;
	        }

	        while (a != b) {
	            if (a > b) {
	                a -= b;
	            } else {
	                b -= a;
	            }
	        }
	        return a;
	    }
		
	    public String Riduzione() {
	        int MCD = MCD(this.numeratore, this.denominatore);
	        
	        this.numeratore /= MCD;
	        this.denominatore /= MCD;
	        return "Frazione ridotta: " + this.numeratore + "/" + this.denominatore;
	    }
}
