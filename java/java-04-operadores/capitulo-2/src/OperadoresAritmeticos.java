
public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroDos = 2;
		int numeroTres = 3;
		
		int resultadoSuma = numeroDos + numeroTres;
		System.out.println("El resultado de sumar " + numeroDos + " y " + numeroTres +" es " + resultadoSuma );
		
		int resultadoResta = numeroTres - numeroDos;
		
		int numeroDosCambioDeSigno = -numeroDos;
		
		System.out.println("si aplicamos el operador resta a numeroDos obtenemos " + numeroDosCambioDeSigno );
		
		double resutadoMultiplicacion = numeroTres * 3.5;
		
		double resultadoDivision = (double)numeroDos / numeroTres;// casteo
		System.out.println("resultadoDivision contiene" + resultadoDivision);
		
		int resultadoModulo = numeroTres % numeroDos;
		System.out.println("el resto de dividir 3 entre 2 es " + resultadoModulo);
		
	}

}
