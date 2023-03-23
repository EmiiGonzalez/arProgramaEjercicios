package clase4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1a {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Ingresar si se desea ordenar ascendente o descendente: a/d");
		String orden = scn.next();
		int datos[] = {100,4,30};
		
		
		System.out.println(Arrays.toString(ordenar(datos, orden)));
		
		scn.close();
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
