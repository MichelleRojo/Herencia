package Entidades;

public class Carnivoro extends Animales{

	public Carnivoro() {
	}

	public Carnivoro(String animal, boolean peligro, int edad) {
		super(animal, peligro, edad);
	}

	
	@Override
	public void Tipoanimal() {
		System.out.println("Leon");
		
	}

	@Override
	public void Alimentacion() {
		System.out.println(" alimentacion con carne");
	}
	@Override
	
	public void mostrarDatos() {
		System.out.println( animal + "es peligroso" + edad);
		if (this.peligro) {
			System.out.println( animal + "es peligroso" + edad);
		}
	}
}
