package herencia;

public abstract class Alimento {

	protected String producto;
	protected String marca;
	protected String rangoPrecio = "bajo, accesible,alto";
	protected String tipo;
	
	
	public Alimento() {
	}
	
	public Alimento(String producto, String marca, String rangoPrecio,String tipo) {
		super();
		this.producto = producto;
		this.marca = marca;
		this.rangoPrecio = rangoPrecio;
		this.tipo=tipo;
	}
	
	protected  abstract void tipoAlimento(String producto, String marca, String rangoPrecio, String tipo);

}