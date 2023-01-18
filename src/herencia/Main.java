package herencia;

public class Main {

	public static void main(String[] args) {
	
	Padre padre1= new Padre("rodriguez");
	System.out.println(padre1);
	padre1.Accion();
	
	
	Hija hija1 = new Hija( "rodriguez" +  "yael" );
	System.out.println(hija1);
	hija1.Accion();
	
	}
}



