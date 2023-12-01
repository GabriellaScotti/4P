
public class TestRettangolo {

	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo ();
		Rettangolo r2 = new Rettangolo (2, 4);
		Rettangolo r3 = new Rettangolo (4, 2);
		Rettangolo r4 = new Rettangolo (r3);
		
		System.out.println(r1.getString());
		System.out.println(r2.getString());
		System.out.println(r3.getString());
		System.out.println(r4.getString());
		
		System.out.println(r3.equals(r2) + "\n");
		
		System.out.println("Perimetro1= " + r1.perimetro());
		System.out.println("Perimetro2= " + r2.perimetro());
		System.out.println("Perimetro3= " + r3.perimetro() + "\n" );
		
		System.out.println("Area1= " + r1.area());
		System.out.println("Area2= " + r2.area());
		System.out.println("Area3= " + r3.area() + "\n");
		
		System.out.println("Somma aree= " + (r1.area() + r2.area() + r3.area()));
		System.out.println("Somma perimetri= " + (r1.perimetro() + r2.perimetro() + r3.perimetro()));
		
		r4.ridimensiona(4, 0);
		System.out.println("\n" + r4.getString());
		
		System.out.println("Somma aree= " + (r1.area() + r2.area() + r3.area()) + "\n");
		System.out.println("Somma perimetri= " + (r1.perimetro() + r2.perimetro() + r3.perimetro()));
		

	}

}
