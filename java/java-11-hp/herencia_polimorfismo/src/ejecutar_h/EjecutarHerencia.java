package ejecutar_h;

import herencia.Hija;
import herencia.Padre;

public class EjecutarHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Padre p = new Padre ("juan", "pachuca");
		p.mostrarDatos();
		
		Hija h = new Hija("dora", "CDMX", 20);
		h.mostrarDatos();
		
		Hija h1 = new Hija("diego", "oklahoma", 30);
		h1.mostrarDatos("pacheco");
		
	}

}
