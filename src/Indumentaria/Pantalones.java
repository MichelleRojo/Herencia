package Indumentaria;

public class Pantalones extends Remeras {

	protected String color;
	
	public Pantalones() {
		
	}
  public Pantalones (String color) {
	  this.color = color;
  }
  
	public Pantalones(String tipoDeRemera, String color) {
		super(tipoDeRemera);
		this.color=color;
		// TODO Auto-generated constructor stub
	}
	
	//SOBRE ESCRIBIR METODO
	@Override
	public void Accion() {
		System.out.println("se venden por mayor");
	}
	@Override
	public String toString() {
		return "Pantalones [color=" + color + "  + " + super.toString();
				 
	}
	
}
