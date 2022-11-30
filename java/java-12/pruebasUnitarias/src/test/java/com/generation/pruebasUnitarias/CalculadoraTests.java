package com.generation.pruebasUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTests {
	Calculadora calc = new Calculadora (true);
	@Test
	@DisplayName("Método que prueba si la súma es correcta")
	void pruebaSuma () {
		Calculadora calc = new Calculadora(true);
		assertEquals(4,calc.suma(2, 2), "deberian ser 4");
	}
	@Test
	@DisplayName("probar si la calculadora está encendida")
	void pruebaIsOn() {
		Calculadora calc = new Calculadora (true);
		assertTrue(calc.isOn());
	}
	@Test
	@DisplayName("Prueba de divisón")
	void pruevaDiv() {
		assertEquals(calc.division(5, 2));
	}
	
}
