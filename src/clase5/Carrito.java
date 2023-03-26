package clase5;

import java.util.List;
import java.util.ArrayList;

public class Carrito {

	private List<ItemCarrito> items;

	public Carrito() {
		this.items = new ArrayList<>();
	}
	
	public List<ItemCarrito> getItems() {
		return items;
	}

	public void setItems(ItemCarrito item) {
		items.add(item);
	}

	public double getObtenerTotalCarrito() {
		double total = 0;
		
		for(ItemCarrito item : this.items) {
			total += item.getSubTotal();
		}
		return total;
	}
}
