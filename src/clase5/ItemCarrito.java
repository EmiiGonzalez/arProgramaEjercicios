package clase5;

public class ItemCarrito {

	
	private Producto producto;
	private int cantidad;
	
	
	public ItemCarrito(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	public ItemCarrito() {
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getSubTotal() {
		double total = this.producto.getPrecio() * this.getCantidad();
		Descuento descuento = new Descuento(total);
		if(this.getCantidad() == 2) {
			total = descuento.getPrecioDescuentox2();
			
		}	else if (this.getCantidad() > 2) {
			total = descuento.getPrecioDescuentox3();
			
		} else {
			total = descuento.getPrecioDescuentox1();
		}
		
		return total;
	}
	
}
