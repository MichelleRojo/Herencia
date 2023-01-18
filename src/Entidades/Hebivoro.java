package Entidades;

public class Hebivoro extends Animales {
	
	
	public Hebivoro() {
		super();

	}

	public Hebivoro(String animal, boolean peligro, int edad) {
		super(animal, peligro, edad);
	
	}

	@Override
	public void Tipoanimal() {
		System.out.println("herbivoro");
	
		
	}

	@Override
	public void Alimentacion() {
		
		System.out.println("lagartija come plantas");
	}

	@Override
	public void mostrarDatos() {
		if (!this.peligro) {
			System.out.println( animal + "no es peligroso" + edad);
		}

	}
	
    	
    }

