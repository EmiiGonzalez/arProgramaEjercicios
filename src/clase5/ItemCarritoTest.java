package clase5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemCarritoTest {
	ItemCarrito objItemTest;
	@BeforeEach
	
	public void setUp() {
		objItemTest = new ItemCarrito();
	}
	
	@Test
	void testGetSubTotal() {
		objItemTest.setCantidad(2);
		objItemTest.setProducto(new Producto("cepillo", 100));
		double total = objItemTest.getSubTotal();
		double totalEsperado = 200;
		boolean result = total == totalEsperado;
		assertTrue(result);
	}

}
