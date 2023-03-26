package clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProgramaCarrito {

	public static void main(String[] args) {
		
		Carrito carrito = new Carrito();
		
		try {
			for(String linea : Files.readAllLines(Paths.get(".\\src\\clase5\\archivos\\productos.txt"))) {
				String nombre = linea.split(",")[0];
				int cantidad = Integer.parseInt(linea.split(",")[1]);
				double precio = Double.parseDouble(linea.split(",")[2]);
				
				Producto producto = new Producto(nombre, precio);
				ItemCarrito itemCarrito = new ItemCarrito(producto, cantidad);
				
				carrito.setItems(itemCarrito);
			}
			System.out.println("El total de la compra es: " + carrito.getObtenerTotalCarrito());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
