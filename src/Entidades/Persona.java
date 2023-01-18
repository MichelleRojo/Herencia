package Entidades;

public abstract class Persona {

	
	protected String nombre;
	protected String apellido;
	protected int edad;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido, int edad) {
		nombre = nombre;
		apellido = apellido;
		this.edad = edad;
	}
	//metodo abstracto
	public abstract void Accion();
	
	public abstract void MostrarDatos();
		
	
	
}
