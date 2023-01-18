package herencia;

import java.util.Scanner;

public  abstract class Helados {

	protected String Color = "rojo";
	
	public void CrearPostre() {
		Scanner in = new Scanner(System.in);
	System.out.println("el sabor de tu helado es " + Color);
	}
}
