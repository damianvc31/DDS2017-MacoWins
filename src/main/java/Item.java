
public class Item implements Comparable<Item> {
	private Prenda prenda;
	private int cantidad;
	
	public Item(Prenda prenda, int cantidad) {
		this.prenda = prenda;
		this.cantidad = cantidad;
	}
	
	public double importe(){
		return cantidad * prenda.precio();
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public int getCantidad() {
		return cantidad;
	}

	@Override
	public int compareTo(Item other) {
		if(this.importe() - other.importe() > 0) return 1;
		else if (this.importe() - other.importe() < 0) return -1;
		else return 0;
	}

}
