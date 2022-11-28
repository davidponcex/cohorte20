package polimorfismo;



public abstract class FigurasGeometricas {
	protected double pValor;
	protected double sValor;
	protected double resultado;
	
	public abstract void pedirDatos();
	
	public abstract void area();
	
	public void visualizar () {
		System.out.println("El resultado del area es:" + resultado);
	}
		
	
}
