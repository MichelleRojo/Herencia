package Entidades;

public class Alumno extends Persona{

	
	protected int añoAcademico;
	
	public Alumno() {
		
	}
	
	
	public Alumno(String nombre, String Apellido, int edad) {
		super(nombre, Apellido, edad);
		// TODO Auto-generated constructor stub
	}


	public Alumno(int añoAcademico) {
		super();
		this.añoAcademico = añoAcademico;
	}


	@Override
	public void Accion() {
		System.out.println("estoy practicando");
		
	}

	@Override
	public void MostrarDatos() {
System.out.println( nombre + apellido + edad);
		
	}

	
	
}
