package clase4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1b {
public static void main(String[] args) {

		
		System.out.println(Arrays.toString(ordenar(datos(), orden())));
		
	}
	
	public static int[] datos () {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Cuantos datos se van a ordenar: ");
		int cantidadDatos = scn.nextInt();
		int datos[] = new int[cantidadDatos];
		
		for(int i = 0; i < datos.length; i++ ) {
			System.out.print("Ingrese un número entero para la posicion " + (i +1) + ": ");
			datos[i] = scn.nextInt();
		}
		
		return datos;
	}
	
	public static String orden() {
		Scanner scn = new Scanner(System.in);
		boolean control = false;
		
		System.out.println("Ingresar si se desea ordenar ascendente o descendente: a/d");
		String orden = scn.nextLine();
		
		if (!orden.equals("a") || !orden.equals("d")) {
			while (!control) {
				System.out.println("ERROR: Valor incorrecto!!\nIngresar si se desea ordenar ascendente o descendente: a/d");
				orden = scn.nextLine();
				if(orden.equals("a") || orden.equals("d")) {
					control = true;
				}
			}
			return orden;
		} else {
			return orden;
		}
		
		
		
		
	}
	
	public static int[] ordenar(int[] datos, String orden) {
		
		if(orden.equals("a")) {
			for(int i = 0; i < datos.length; i++) { //primer ciclo para recorrer todo el array completo
				for(int j = 0; j < datos.length-i-1; j++) { //segundo ciclo para recorrer el array de a pares y con decremento para no recorrer los valores movidos ni pasarse de la longitud del array
					if(datos[j] > datos[j+1]) { //si es mayor que el siguiente
						int aux = datos[j];	//guardo el valor en una variable auxiliar
						datos[j] = datos[j+1]; //le doy el valor del siguiente
						datos [j+1]= aux;	// al siguiente le doy el valor del auxiliar 
						}
					}
				
				}
		} else if(orden.equals("d")) {
			for(int i = 0; i < datos.length; i++) { 
				for(int j = 0; j < datos.length-i-1; j++) { 
					if(datos[j] < datos[j+1]) { 
						int aux = datos[j];	
						datos[j] = datos[j+1]; 
						datos [j+1]= aux;	
						}
					}
				
			}
		} 
		
		return datos;
	}
}
