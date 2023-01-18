package Ejemplo;

public class Transportes {
	
protected int asientos;

public Transportes() {
	
}

public Transportes (int asientos) {
	this.asientos=asientos;
	
}
public int Velocidad(){
	int Velocidad = 50;
	System.out.println("estoy conduciendo a velocidad minima "  +  Velocidad  + "km");
	return Velocidad;
}

}
