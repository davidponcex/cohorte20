import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("bienvenido al conversor de monedad");
		System.out.println("por favor, introduzca una cantidad en euros y el programa le devolvera la conversion en dolaes americnos");
		
		Scanner scanner = new Scanner (System.in);
		double euros = scanner.nextDouble();
		
		double dolares = 1.09 * euros;
		System.out.println (  + dolares + " US dolres");
	}

}
