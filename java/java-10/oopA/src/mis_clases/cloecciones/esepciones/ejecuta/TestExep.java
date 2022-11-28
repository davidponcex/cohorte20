package mis_clases.cloecciones.esepciones.ejecuta;

import mis_clases.cloecciones.esepciones.operacion.Divicion;
import mis_clases.cloecciones.esepciones.operacion.OperacionExeption;

public class TestExep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Divicion d = new Divicion(4,0);
		} catch (OperacionExeption e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		
	}
		
	}

