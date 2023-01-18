package Indumentaria;
import Indumentaria.Remeras;
import Indumentaria.Pantalones;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Remeras remeras= new Remeras("manga corta");
	System.out.println(remeras);
	remeras.Accion();
	
	Pantalones pantalon = new Pantalones("azul oscuro");
	
	System.out.println(pantalon);
	pantalon.Accion();
	}

}
