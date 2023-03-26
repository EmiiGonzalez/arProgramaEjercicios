package clase5;

public class Descuento {
	private double total;

	public Descuento(double total) {
		this.total = total;
	}


	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getPrecioDescuentox2() {
		double total = this.getTotal();
		return total;
	}
	public double getPrecioDescuentox3() {
		double total = this.getTotal() - ( (this.getTotal() * 30) / 100);
		return total;
	}

	public double getPrecioDescuentox1() {
		double total = this.getTotal();
		return total;
	}
	
}
