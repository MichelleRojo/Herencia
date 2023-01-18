package Ejemplo;

public class Auto extends Transportes {

protected int año;

public Auto() {
	
}

public Auto(int año) {
	this.año = año;
}

//constructor compartido de la clase padre transporte
public Auto(int asientos, int año) {
	super(asientos);
	this.año = año;
}
@Override
public int Velocidad() {
	int Velocidad=100;
	System.out.println("puede ir a una velocidad alta");
	return Velocidad;
	
}

@Override
public String toString() {
return "Auto: " +
		"año" + año + super.toString();




}
	
}
