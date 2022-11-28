package polimorfismo;

import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas{
Scanner s = new Scanner(System.in);
private double base;
private double altura;

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t Area de Rectangulo ");
		System.out.print("introduzca la base: ");
		base = s.nextDouble();
		System.out.print("introduzca la altura: ");
		altura = s.nextDouble();
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado = (base * altura);
	}

}
