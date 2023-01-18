package herencia;

public class Perecedero extends Alimento {

	public Perecedero() {
		
	}

	public Perecedero(String producto, String marca, String rangoPrecio, String perecedero) {
		super(producto, marca, rangoPrecio,perecedero);
		
	}

	@Override
	protected void tipoAlimento(String producto, String marca, String rangoPrecio, String perecedero ) {
		System.out.println(producto + marca + rangoPrecio + perecedero);
		
	}

	protected void tipoAlimento(String string) {
		// TODO Auto-generated method stub
		
	}
	
}
