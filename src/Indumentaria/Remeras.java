package Indumentaria;

public class Remeras {

	protected String tipoDeRemera;

	public  Remeras() {
	}
	
	public Remeras(String tipoDeRemera) {
		this.tipoDeRemera = tipoDeRemera;
	}
	//metodo
	public void Accion() {
		System.out.println("estan en ventas las remeras");
	}

	@Override
	public String toString() {
		return "Remeras [tipoDeRemera=" + tipoDeRemera + "]";
	}
	
}
