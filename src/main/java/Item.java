
public class Item {
	private Prenda prenda;
	private int cantidad;
	
	public Item(Prenda prenda, int cantidad) {
		this.prenda = prenda;
		this.cantidad = cantidad;
	}
	
	public double importe(){
		return cantidad * prenda.precio();
	}

}
