package ejerciciosPunto1;

import java.util.Arrays;

public class OrdenamientoDeDatos {

	public static void main(String[] args) {
		
		int datos[] = {100,4,30};
		
		for(int i = 0; i < datos.length; i++) { //primer ciclo para recorrer todo el array completo
			for(int j = 0; j < datos.length-i-1; j++) { //segundo ciclo para recorrer el array de a pares y con decremento para no recorrer los valores movidos ni pasarse de la longitud del array
				if(datos[j] > datos[j+1]) { //si es mayor que el siguiente
					int aux = datos[j];	//guardo el valor en una variable auxiliar
					datos[j] = datos[j+1]; //le doy el valor del siguiente
					datos [j+1]= aux;	// al siguiente le doy el valor del auxiliar 
					}
				}
			
			}
		System.out.println(Arrays.toString(datos));
		}
			
		
	}


