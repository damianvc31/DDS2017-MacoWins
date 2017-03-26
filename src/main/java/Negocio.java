import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Negocio {
	private List<Venta> ventas;

	public Negocio() {
		ventas = new ArrayList<>();
	}
	
	public double gananciasDeUnDia(LocalDate fecha){
		return ventas.stream()
				.filter(venta -> venta.esDeFecha(fecha))
				.mapToDouble(venta -> venta.importe())
				.sum();
	}
	public void registrarVenta(Venta venta){
		ventas.add(venta);
	}

	public List<Venta> getVentas() {
		return ventas;
	}
	
}
