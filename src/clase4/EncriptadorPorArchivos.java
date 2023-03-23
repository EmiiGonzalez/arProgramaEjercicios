package clase4;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EncriptadorPorArchivos {


    public static void main(String[] args) {

        String letras = "abcdefghijklmnñopqrstuvwxyz";
        String archivoLeer = args[1];
        String archivoEscribir = args[2];
        int clave = Integer.parseInt(args[3]);
        
        
        //para encriptar enviar como parametro e y para desencriptar enviar como parametro d
        if(args[0].charAt(0) == 'e' ) { 
        	String palabra = encriptar(clave, archivoLeer, letras);
        	escribirArchivo(archivoEscribir, palabra);
        	
        }	else if (args[0].charAt(0) == 'd'){
        	
        	String palabra = desencriptar(clave, archivoLeer, letras);
        	escribirArchivo(archivoEscribir, palabra);
        	
        }
       

    }

    public static String encriptar(int desplazamiento, String archivo, String abc) {
        String encriptado = "";
        int largoAbc = abc.length();
        
        String palabra = leerArchivo(archivo);

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            int posicion = abc.indexOf(caracter);
            int mover = 0;

            if ((posicion + desplazamiento) >= largoAbc) {
                mover = (posicion + desplazamiento) % largoAbc;
                caracter = abc.charAt(mover);
             
            } else if(posicion == -1) {
            	caracter = ' ';
            } else {
                caracter = abc.charAt(posicion + desplazamiento);
            }

            encriptado += caracter;
        }
        return encriptado;
    }
    
    public static String desencriptar(int desplazamiento, String archivo, String abc) {
        String desencriptado = "";
        int largoAbc = abc.length();
        
        String palabra = leerArchivo(archivo);

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            int posicion = abc.indexOf(caracter);
            int mover = 0;

            if ((posicion - desplazamiento) < 0) {
            	if (posicion == -1) {
                    caracter = ' ';
                } else {
                mover = ((posicion - desplazamiento) % largoAbc + largoAbc) % largoAbc;
                caracter = abc.charAt(mover);
                }
            } else {
                caracter = abc.charAt(posicion - desplazamiento);
            }

            desencriptado += caracter;
        }
        return desencriptado;
    }
    
    public static String leerArchivo(String archivo) {
    	String leido = "";
		try {
			leido = Files.readString(Paths.get(archivo));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("el archivo a leer no existe");
		}
    	return leido;
    }
    
    public static void escribirArchivo(String archivo, String texto) {
    	Path otroArch = Paths.get(archivo);
    	Charset codificar = StandardCharsets.UTF_8;
    	byte[] contenido = texto.getBytes(codificar);
    	
    	try {
    		Files.write(otroArch, contenido, StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
		} catch (Exception e) {
			 e.printStackTrace();
		}
    	System.out.println("archivo escrito");
    }
    
}
