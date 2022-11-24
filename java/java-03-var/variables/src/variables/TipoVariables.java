package variables;

public class TipoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte, short, int, long primitivos numericos de tipo entero
		byte numeroB = 127;
		System.out.println("tamaño de un byte " + Byte.SIZE);
		System.out.println("valor maximo de un byte " + Byte.MAX_VALUE);
		System.out.println("valor minimo de un byte " + Byte.MIN_VALUE);
		
		int entero = 5;
		System.out.println("tamaño de un entero " + Integer.BYTES );
		System.out.println("tamaño " + Integer.SIZE);
		System.out.println("valor max " + Integer.MAX_VALUE);
		System.out.println("valor min " + Integer.MIN_VALUE);
		System.out.println("el valor de entero " + entero);
		
		System.out.println("-----short------ " );
		short variableS = 6;
		System.out.println("tamaño de short " + Short.SIZE);
		System.out.println("valor bytes short " + Short.BYTES);
		System.out.println("valor min short" + Short.MIN_VALUE);
		System.out.println("el valor max short " + Short.MAX_VALUE);
		
		System.out.println("-----long------ " );
		long variableL = 565;
		System.out.println("tamaño de long " + Long.SIZE);
		System.out.println("valor bytes long " + Long.BYTES);
		System.out.println("valor min long" + Long.MIN_VALUE);
		System.out.println("el valor max long " + Long.MAX_VALUE);
		
		var sistemaNum = 0b101;//sistema binario
		System.out.println( "---> " + sistemaNum);
		
		
		System.out.println( "------primitivos float, double-----");
		
		System.out.println("-----float------- "  );
		
		System.out.println("tamaño de float " + Float.SIZE );
		System.out.println("valor bytes float " + Float.BYTES);
		System.out.println("valor min float" + Float.MIN_VALUE);
		System.out.println("el valor max float " + Float.MAX_VALUE);
		var comaF = 100F;
		
		System.out.println("-----double------- "  );
		
		System.out.println("tamaño de double " + Double.SIZE);
		System.out.println("valor bytes double " + Double.BYTES);
		System.out.println("valor min double" + Double.MIN_VALUE);
		System.out.println("el valor max double " + Double.MAX_VALUE);
		var comaD = 1000.10E23D;
		System.out.println("--> float " + comaF);
		System.out.println("--> double " + comaD);
		
		System.out.println("--------bloeanos-------");
		
		boolean estado = true; //false
		System.out.println("--> " + estado);
		
		if (estado)
		{
			System.out.println("-----soy verdadero");
		}else {
			System.out.println("--> soy falso");
		}
		
		var edad = 10;
		if(edad >= 10) {
			System.out.println("---> : varBool es mayor igual a > " + edad);
		}else {
			System.out.println("-->: varBool la edad es menor  > " + edad);
		}
		
		System.out.println("------------chart-----------");
		char caracter = 'a';
		System.out.println("-->  " + caracter);
		
	}
	}
	


