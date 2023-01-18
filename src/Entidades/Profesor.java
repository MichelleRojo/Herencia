package Entidades;
import Entidades.Alumno;
import Entidades.Profesor;
public class Profesor extends Persona{

protected String materia;
public Profesor() {
	
}
public Profesor(String materia) {
	this.materia = materia;
}
public Profesor(String nombre, String apellido, int edad, String materia) {
	super(nombre, apellido, edad);
	this.materia = materia;
}
@Override
public void Accion() {
	System.out.println("estoy enseñando");
}
@Override
public void MostrarDatos(){
System.out.println(nombre + apellido + edad  + materia);
}
}


