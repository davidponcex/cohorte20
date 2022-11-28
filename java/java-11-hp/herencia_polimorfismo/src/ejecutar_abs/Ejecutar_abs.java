package ejecutar_abs;

import polimorfismo.Circulo;
import polimorfismo.Cuadrado;
import polimorfismo.FigurasGeometricas;
import polimorfismo.Rectangulo;
import polimorfismo.Triangulo;

public class Ejecutar_abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FigurasGeometricas t = new Triangulo();
		FigurasGeometricas c = new Cuadrado();
		FigurasGeometricas cir = new Circulo();
		FigurasGeometricas rect = new Rectangulo();
		
		rect.pedirDatos();
		rect.area();
		rect.visualizar();
		
		t.pedirDatos();
		t.area();
		t.visualizar();
		
		c.pedirDatos();
		c.area();
		c.visualizar();
		
		cir.pedirDatos();
		cir.area();
		cir.visualizar();
	}

}
