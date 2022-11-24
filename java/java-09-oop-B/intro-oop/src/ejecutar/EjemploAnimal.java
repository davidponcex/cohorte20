package ejecutar;

import clases.Animal;

public class EjemploAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal miAnimal = new Animal ("x");
		miAnimal.setEdad(3);
		System.out.println("El nombre es: " + miAnimal.getNombre());
		System.out.println("y tiene " + miAnimal.getEdad() + "años");
		
		Animal otroAnimal;
		otroAnimal = new Animal ();
		otroAnimal.setNombre(null);
		otroAnimal.setEdad (2);
		
		System.out.println("el nuevo animal es: " otroAnimal.getNombre());
		System.out.println("su edad es : " + otroAnimal.getEdad());
		
	
		
		
	}

}
