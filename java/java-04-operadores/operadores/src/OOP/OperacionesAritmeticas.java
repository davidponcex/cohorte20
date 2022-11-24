package OOP;

import java.util.Scanner;

public class OperacionesAritmeticas {
	Scanner s = new Scanner (System.in);

double add() {
	System.out.print("introduzca el numero 1 ->");
	double valor0 = s.nextDouble();
	System.out.print("introduzca el numero 2 ->");
	double valor1 = s.nextDouble();
	
	return valor0 + valor1;
	}

	double sustraccion () {
	System.out.print("introduzca el numero 1 a restar  ->");
	double valor0 = s.nextDouble();
	System.out.print("introduzca el numero 2 a restar  ->");
	double valor1 = s.nextDouble();
	
	return valor0 - valor1;
	}
	
	double div () {
		System.out.print("introduzca el numero 1 a dividir  ->");
		double valor0 = s.nextDouble();
		System.out.print("introduzca el numero 2 a dividir  ->");
		double valor1 = s.nextDouble();
		if (valor1 != 0) {
		return valor0 / valor1;
		} else {
			System.out.println("No se puede dividir por cero");
		}
		return 0;
		}
		
double multi () {
System.out.print("introduzca el numero 1 a multiplicar  ->");
double valor0 = s.nextDouble();
System.out.print("introduzca el numero 2 a multiplicar  ->");
double valor1 = s.nextDouble();

return valor0 - valor1;
}
double modulo () {
System.out.print("introduzca el numero 1 a restar  ->");
double valor0 = s.nextDouble();
System.out.print("introduzca el numero 2 a restar  ->");
double valor1 = s.nextDouble();

return valor0 - valor1;
}
}