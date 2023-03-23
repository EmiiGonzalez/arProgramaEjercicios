package clase4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio2 {
	
	
	
	public static void main(String[] args) {
		//archivo =  ".\\src\\clase4\\archivos\\archivo.txt";
		if (args.length < 1) {
		      System.out.println("Debe ingresar la ruta del archivo como parametro.");
		      System.exit(1);
		   }
		String archivo = args[0] ;
		
		System.out.println(lecturaNumeros(archivo));
	}
	
	public static int lecturaNumeros(String archivo) {
		
		int suma = 0;
		try {
			for (String linea : Files.readAllLines(Paths.get(archivo), StandardCharsets.ISO_8859_1)) {
				for (int i = 0; i < linea.split(",").length; i++) {
					suma += Integer.parseInt(linea.split(",")[i]);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en la lectura del archivo");
		}
		
		return suma;
	}
}
