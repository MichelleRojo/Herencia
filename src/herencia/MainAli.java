package herencia;


public class MainAli {

	public static void main(String[] args) {

		Perecedero perecedero1 = new Perecedero();
		perecedero1.tipoAlimento("arroz, gallo,bajo, perecedero");	
		

		Noperecedero noperecedero2 = new Noperecedero();
	    System.out.println(noperecedero2);
	    noperecedero2.tipoAlimento("carne, coto,alto,noperecedero");
      
	
	
}
	

}
