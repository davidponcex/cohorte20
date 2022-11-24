package OOP;

public class EjemoloClases {
	
		static void cambio () {
	
			Tablas t = new Tablas();
			Menu m = new Menu();
			SubMarino sm = new SubMarino();
			
			int numero = m.menuOp();
			
			switch (numero) {
			case 1:{
				t.tabla();
				break;
			}
			case 2:{
				sm.subMenu();
				break;
			}
			default:
				
			}
			
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjemoloClases.cambio();
	}

}
