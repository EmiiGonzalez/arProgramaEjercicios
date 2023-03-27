package clase6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	Calculadora calculadoraTest;
	
	@BeforeEach
	public void setUp() {
		Calculadora calculadoraTest = new Calculadora();
	}

	
	@Test
	void multiplicar() {
		double resultado = calculadoraTest.multiplicar(80, 3);
		double totalEsperado = 240;
		boolean result = resultado == totalEsperado;
		assertTrue(result);
	}
	@Test
	void sumarDiv() {
		double resultadoSuma = calculadoraTest.sumar(150, 180);
		double resultado = calculadoraTest.dividir(resultadoSuma, 3);
		double totalEsperado = 110;
		boolean result = resultado == totalEsperado;
		assertTrue(result);
	}
	@Test
	void restarMulti() {
		double resultadoResta = calculadoraTest.restar(90, 50);
		double resultado = calculadoraTest.multiplicar(resultadoResta, 15);
		double totalEsperado = 605;
		boolean result = resultado == totalEsperado;
		assertFalse(result);
	}
	@Test
	void sumarMulti() {
		double resultadoResta = calculadoraTest.sumar(70, 40);
		double resultado = calculadoraTest.multiplicar(resultadoResta, 25);
		double totalEsperado = 2700;
		boolean result = resultado == totalEsperado;
		assertFalse(result);
	}

}
