package Entidades;
import Entidades.Alumno;
import Entidades.Profesor;

public class Main {
	public static void mains(String[] args) {
		
		Alumno alumno = new Alumno ("michelle", "rojo" , 27);
		alumno.Accion();
		alumno.MostrarDatos();
	

	Profesor profesor = new Profesor("Mic", "red", 27, "Frances");
			profesor.Accion();
	       profesor.MostrarDatos();
}

}