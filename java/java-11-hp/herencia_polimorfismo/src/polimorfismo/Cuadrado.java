package polimorfismo;

import java.util.Scanner;

public class Cuadrado extends FigurasGeometricas {
	
	Scanner s = new Scanner(System.in);
	private double lado;
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t Area de Cuadrado: ");
		System.out.print("introduzca la medida de un lado: ");
		lado = s.nextDouble();
		
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado = lado * lado;
	}
	
}
