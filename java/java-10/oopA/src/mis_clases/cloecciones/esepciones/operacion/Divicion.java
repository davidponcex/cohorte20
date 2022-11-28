package mis_clases.cloecciones.esepciones.operacion;

public class Divicion {
	private int numerador;
	private int denominador;
	
	public Divicion(int numerador, int denominador) throws OperacionExeption {
		 if (denominador == 0) {
			 return new OperacionExeption ("El denominador es cero");
		 }
		 this.numerador = numerador;
		 this.denominador = denominador;
	}
	
	public void visualizarD() {
		System.out.println("resultado de la division " + (this.numerador/this.denominador));
	}
}
