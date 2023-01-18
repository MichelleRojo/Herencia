package herencia;

public class Padre {

	protected String apellido;
	public Padre() {
		
	}

	public Padre(String apellido) {
		super();
		this.apellido = apellido;
	}
	public void Accion() {
		System.out.println("Esta caminando");
	}
	@Override
	public String toString() {
		return "Padre [apellido=" + apellido + "]";
	}
	
}
