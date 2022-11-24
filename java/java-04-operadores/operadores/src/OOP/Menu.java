package OOP;

import java.util.Scanner;

public class Menu {
Scanner s = new Scanner (System.in);

int menuOp() {

int numero = 0 ; 
			
	System.out.println("\t\t ----- Menu-----");
	System.out.println(" 1: Taablas de multiplicar");
	System.out.println(" 2: operaciones aritmeticas");
	System.out.println(" 3: Multiplicacion");
	System.out.println(" 4: Division");
	System.out.println(" 5: Modulo");
	System.out.println(" 6: Booleans");
		
	System.out.println(" introduzca la opcion");
	return numero = s.nextInt();	
	
}

int subMenuOp() {

int numero = 0 ; 
			
	System.out.println("\t\t ----- Menu-----");
	System.out.println("\t\t 1: Taablas de multiplicar");
	System.out.println(" \t\t2: operaciones aritmeticas");
	System.out.println(" \t\t3: Multiplicacion");
	System.out.println(" \t\t4: Division");
	System.out.println("\t\t 5: Modulo");
	System.out.println("\t\t 6: Booleans");
	System.out.println("\t\t 7: salir");
	System.out.println(" introduzca la opcion");
	return numero = s.nextInt();

}
}
