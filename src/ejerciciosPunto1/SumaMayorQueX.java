package ejerciciosPunto1;

public class SumaMayorQueX {

	public static void main(String[] args) {
		int array[] = {3, 8, 2, 10, 5, 1};
		int x = 4;
		int suma = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]>x) {
				suma = suma + array[i];
			}
		}
		
		System.out.println("La suma de numeros mayores que " + x + " es: " + suma);

	}

}
