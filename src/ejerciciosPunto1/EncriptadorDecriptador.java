package ejerciciosPunto1;

import java.util.Scanner;

public class EncriptadorDecriptador {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String letras = "abcdefghijklmnñopqrstuvwxyz";
        System.out.println(letras.length());

        System.out.println("Ingrese una frase a encriptar: ");
        String palabra1 = scn.nextLine();
        
        System.out.println("Ingrese una clave para desplazar: ");
        int clave = scn.nextInt();
        
        
        String palabra2 = encriptar(clave, palabra1, letras);
        String palabra3 = desencriptar(clave, palabra2, letras);
       
        System.out.println(palabra2);
        System.out.println(palabra3);
    }

    public static String encriptar(int desplazamiento, String palabra, String abc) {
        String encriptado = "";
        int largoAbc = abc.length();

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
    
    public static String desencriptar(int desplazamiento, String encriptado, String abc) {
        String desencriptado = "";
        int largoAbc = abc.length();

        for (int i = 0; i < encriptado.length(); i++) {
            char caracter = encriptado.charAt(i);
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
}
    