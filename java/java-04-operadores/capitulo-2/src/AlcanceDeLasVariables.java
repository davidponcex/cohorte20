
public class AlcanceDeLasVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dias = 0;
		
		while (dias < 30) {
			dias = dias + 1; //suma 1 a dias
			int semanas = dias / 7;
			System.out.println("Han pasado " + dias + "dias, lo que supone" + semanas + "semanas");
			//int dias = 8;  NO SE PUEDE DECLARAR UNA VARIABLE EN UN BLOQUE INTERIOR CON EL MISMO NOMBRE 
			//QUE UNA VAIRABLE EXTERIOR
		}
	    // int años = semanas / 52 NO SE PUEDE ACCEDER A LA VARIABLE POR QUE ESTA DENTRO DE 
		// UN BLOQUE
		int años = dias / 365;// DIAS PERTENECE AL MISMOBLOQUE
	}

}
