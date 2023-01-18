package herencia;

public class  Noperecedero extends Alimento {

	
	public Noperecedero() {
	}

	public Noperecedero(String producto, String marca, String rangoPrecio, String noperecedero) {
		super(producto, marca, rangoPrecio,noperecedero );
		
	}

	@Override
	protected void tipoAlimento(String producto, String marca, String rangoPrecio, String noperecedero) {
		System.out.println(producto + marca + rangoPrecio + noperecedero );
		
	}

	protected void tipoAlimento(String string) {
		// TODO Auto-generated method stub
		
	}
		
		
		}
