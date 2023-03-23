package ejerciciosPunto1;

import java.util.Scanner;

public class ContadorDeLetras {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar la palabra o texto a la cual contar letras");
		String palabra = sc.nextLine();
		System.out.println("Ingrese la letra que desea contar las apariciones");
		String letra = sc.next();
		
		
		
		System.out.println("La letra " + letra.toUpperCase() + " aparece " + contarLetras(letra, palabra) + " veces en: " + palabra);
		sc.close();
	}
	
	public static int contarLetras(String letra, String palabra) {
		int contador = 0;
		
		for(int i = 0; i<palabra.length();i++) {
			if (palabra.trim().charAt(i) == letra.charAt(0)) {
				contador++;
			}
		}
		
		return contador;
	}
	
	
}

/*
 Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
el String
 */