package herencia;

public class Hija extends Padre{

	
	protected String nombrehija;

	public Hija(String nombrehija) {
		this.nombrehija = nombrehija;
	}
	public Hija(String apellido, String nombre) {
		super(apellido);
		this.nombrehija=nombre;
	}
	@Override
	
	// esto es lo que a hacer la hija
	public void Accion() {
		System.out.println("voy a salir a correr");
	}
	@Override
	public String toString() {
		return "Hija [nombrehija=" + nombrehija + "]";
	}
	
}
