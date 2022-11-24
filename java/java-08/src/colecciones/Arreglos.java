package colecciones;

import java.util.Arrays;

public class Arreglos {
	public static void main(String[] args) {
		//Arrays-Arreglos-Matrices
		//solo permiten un tipo de dato
		//se tiene que especificar su tamaño
		
		
		String [] miArreglo = new String[5];
		
		miArreglo[0]= "david";
		miArreglo[1]="david";
		miArreglo[2]="david";
		miArreglo[3]="david";
		miArreglo[4]="david";
		System.out.println(miArreglo);
		
		//for
		
		for (int i=0; i<miArreglo.length; i++) {
			System.out.println("ciclo for: " + miArreglo[i]);
		}
		for (String nombre: miArreglo) {
			System.out.println("for each: " + nombre);
		}
		System.out.println(Arrays.toString(miArreglo));
		
		//Tipos de valores
		int numeros []= new int[5];
		numeros[0]= 4;
		numeros[1]= -3;
		numeros[2]= 654;
		numeros[3]= (int) 2.43;
		numeros[4]= Integer.parseInt("2");
		
		for(int numero: numeros) {
			System.out.println("valores del arreglo numeros " + numero );
		}
		
		//Arreglos de objeos
		
		Persona persona1 = new Persona("david", 30);
		Persona persona2 = new Persona("monica", 25);
		//
		Persona[] arrPersonas = new Persona[3];
		
		arrPersonas[0]= persona1;
		arrPersonas[1]= persona2;
		arrPersonas[2] = new Persona("sandy", 25);
		
		System.out.println(arrPersonas[0].nombre);
		System.out.println(arrPersonas[1].nombre);
		System.out.println(arrPersonas[2].nombre);
		
		for(Persona persona : arrPersonas) {
			System.out.println("nombre " + persona.nombre + " edad " + persona.edad);
		}
		//Arreglos literales 
		String[] arrString = {
				"manzana", "pera", "12", "hola"};
		System.out.println(Arrays.toString());
		
		
	}}
