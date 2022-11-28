package herencia;

public class Hija extends Padre{

	private int edad;
	

	public Hija(String nombre, String domicilio, int edad) {
		super(nombre, domicilio);
		this.edad = edad;
	}
	public void mostrarDatos () {
		System.out.println("el nombre es: " + nombre + " " + " El domicilio es: " 
							+ domicilio+ " " + " la edad es: " + edad);
		
	}
	
	public void mostrarDatos (String apellido) {
		
		System.out.println("el nombre y el apwllido es: " + nombre + " " + apellido + " " + " El domicilio es: " 
				+ domicilio+ " " + " la edad es: " + edad);
	}
}
