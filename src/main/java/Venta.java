import java.util.List;
import java.time.LocalDate;

public class Venta {
	protected final List<Item> items;
	protected final LocalDate fecha;

	public Venta(List<Item> items, LocalDate fecha) {
		this.items = items;
		this.fecha = fecha;
	}
	
	public double importe(){
		return items.stream().mapToDouble(item -> item.importe()).sum();
	}
	public boolean esDeFecha(LocalDate fecha){
		return this.fecha.compareTo(fecha) == 0;
	}
	public LocalDate getFecha() {
		return fecha;
	}

	
}
