public class Rettangolo {
  //Lo stato interno di un rettangolo è dato dai valori della base e dell’altezza.
  private int base;
  private int altezza;

  //Realizzare un costruttore di default che realizza un rettangolo di dimensione 1, 1
  public Rettangolo() {
    this.altezza = 1;
    this.base = 1;
  }

  //Realizzare un costruttore in cui si specifica base e altezza
  public Rettangolo(int bas, int alt) {
    this.base = bas;
    this.altezza = alt;
  }

  //Realizzare metodi getter e setter, in particolare per i metodi setter controllare che i valori siano ammissibili (maggiori di zero)
  public int getBase() {
    return this.base;
  }

  public int getAltezza() {
    return this.altezza;
  }

  public void setBase(int b) {
    if (b > 0)
      this.base = b;
    else this.base = 1;
  }

  public void setAltezza(int a) {
    if (a > 0)
      this.altezza = a;
    else this.altezza = 1;
  }

  //Realizzare un metodo getString che restituisce una stringa informativa delle dimensioni del rettangolo
  public String getString() {
    return "Base= " + base + "\n" + "Altezza= " + altezza + "\n";
  }

  /*public Rettangolo ridimensiona (int a, int b) {
  	this.base = b;
  	this.altezza = a;
  	return this;
  }*/

  //ridimensiona, che prende come parametri due nuovi valori di base e altezza e aggiorna lo stato
  public Rettangolo ridimensiona(int b, int a) {
    setBase(b);
    setAltezza(a);
    return this;
  }

  //perimetro, che restituisce il perimetro
  public int perimetro() {
    return ((2 * this.base) + (2 * this.altezza));
  }

  //area, che restituisce l’area
  public int area() {
    return ((this.base) * (this.altezza));
  }

  //equals, restituisce true se il rettangolo dati in ingresso è uguale a quello attuale
  public boolean equals(Rettangolo r2) {
    if (this.altezza == r2.altezza && this.base == r2.base) {
      return true;
    } else return false;
  }

  //costruttore di copia
  public Rettangolo(Rettangolo r2) {
    this.altezza = r2.altezza;
    this.base = r2.base;
  }

}