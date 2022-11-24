import java.util.Scanner;

public class IntroduccionCaracteresTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("como te llamas? ");
		String nombre = scanner.nextLine();
		System.out.println("Hola " + nombre + " ¡Bienvenido! ");
		System.out.println("Introduce tu edad");
		int edad = scanner.nextInt();
		System.out.println("Tienes " + edad + " años ");
	}

}
