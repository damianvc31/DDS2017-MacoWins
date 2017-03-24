import java.time.LocalDate;
import java.util.List;

public class VentaConTarjeta extends Venta {
	private final double coefTarjeta;
	private final int cantCuotas;
	
	public VentaConTarjeta(List<Item> items, LocalDate fecha, double coefTarjeta, int cantCuotas) {
		super(items, fecha);
		this.coefTarjeta = coefTarjeta;
		this.cantCuotas = cantCuotas;
	}
	private double recargo(){
		return coefTarjeta * cantCuotas * 0.01 * super.importe();

	}
	@Override
	public double importe() {
		return super.importe() + recargo();
	}
	
	
}
