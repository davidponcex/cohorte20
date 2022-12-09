import java.util.Scanner;

public class MaximoComunDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce el primer numero");
		int a = sc.nextInt();
		
	
		System.out.println("introduce el segundo numero");
		int b = sc.nextInt();
		
		int res = MaximoComunDivisor(a,b);
		System.out.println("el mcd " + res );
	}
	
		public static int MaximoComunDivisor(int a, int b) {
			int maroy = Math.max(a, b);
			int menor = Math.min( a, b);
			int resultado = 0;
			do {
			resultado = b;
			b= a%b;
			a = resultado;
		}while(b != 0);
			return resultado;
			
		}
	}

	


