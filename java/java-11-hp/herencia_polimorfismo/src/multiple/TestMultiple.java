package multiple;

public class TestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma suma = new Suma(5,5);
		OperacionesAritmeticas oa = new Suma(10,5);
		Operaciones o = new Suma(3,2);
		
		Resta resta = new Resta (10,5);
		OperacionesAritmeticas oar = new Resta (3,2);
		Operaciones or = new Resta(3,2);
		
		o.mensajes();
		System.out.println("Obj oa: " + oa.sumar());
		System.out.println("la suma es: " + suma.sumar());
		suma.mensajes();
		
		resta.mensajes();
		System.out.println("la resta es: " + resta.restar());
		System.out.println("obj oar " + oar.restar() );
		or.mensajes();
	}
	
}
