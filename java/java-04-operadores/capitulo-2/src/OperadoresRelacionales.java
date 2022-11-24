
public class OperadoresRelacionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// comparacion de valores el reultado es un booleano TRUE o FALSE
		boolean esUnoMayorQueDos = 1 > 2;
		System.out.println("¿ Es 1 mayor que 2 ? " + esUnoMayorQueDos);
		boolean esUnoComaCincoMenorQueSieteComaDos = 1.5 < 7.2 ;
		
		boolean esOchoMayorOIgualQueOcho = 8 >= 8;
		
		System.out.println("¿Es ocho mayor o igual que ocho? " + esOchoMayorOIgualQueOcho );
		
		boolean esTresComaUnoIgualQueTresComaDos = 3.1 == 3.2;
		
		boolean esCuatroDiferenteDeCuatro = 4 != 4;
		System.out.println("es 4 diferente de 4 " + esCuatroDiferenteDeCuatro );
		
		String perro = "perro";
		String gato = "gato";
		System.out.println("el string perro es igual al string gato? " + perro == gato);
		
		
	}

}
