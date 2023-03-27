package clase6;

public class Calculadora {
	private double unNumero;
	private double otroNumero;
	
	public Calculadora(double unNumero, double otroNumero) {
		this.unNumero = unNumero;
		this.otroNumero = otroNumero;
	}
	
	public Calculadora() {
	}
	
	public double getUnNumero() {
		return unNumero;
	}

	public void setUnNumero(double unNumero) {
		this.unNumero = unNumero;
	}

	public double getOtroNumero() {
		return otroNumero;
	}

	public void setOtroNumero(double otroNumero) {
		this.otroNumero = otroNumero;
	}

	public static double sumar(double unNumero, double otroNumero) {
		double resultado = unNumero + otroNumero;
		return resultado;
	}
	
	public static double restar(double unNumero, double otroNumero) {
		double resultado = unNumero - otroNumero;
		return resultado;
	}
	
	public static double multiplicar(double unNumero, double otroNumero) {
		double resultado = unNumero * otroNumero;
		return resultado;
	}
	
	
	public static double dividir(double unNumero, double otroNumero) {
		double resultado = unNumero / otroNumero;
		return resultado;
	}

}
