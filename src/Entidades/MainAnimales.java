package Entidades;


public abstract class MainAnimales extends Animales{

	public static void main(String[] args) {
	

		Carnivoro leon = new Carnivoro("leon es y tiene de edad ",true , 6);
		leon.Tipoanimal();
        leon.Alimentacion();
        leon.mostrarDatos();

		Hebivoro lagartija = new Hebivoro();
        lagartija.Tipoanimal();
        lagartija.Alimentacion();
        lagartija.mostrarDatos();


    }


	}


