package clases;

public class Animal {
	private String raza;
	private String nombre;
	private int edad;

public Animal() {
	
}

public Animal(String nombre) {
	this.nombre = nombre;
}

public void setEdad(int edad) {
	this.edad = edad;
}

	


public void setNombre(String Nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}


public String getNombre(){
	return nombre;
}
public void setNombre(String Nombre) {
	this.nombre = Nombre;
}

}