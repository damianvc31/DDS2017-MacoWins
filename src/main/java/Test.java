import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.time.LocalDate;


public class Test {

	public static void main(String[] args) {
		Negocio negocio = new Negocio();
		
		Prenda prenda1 = new Prenda(Rubro.CAMISA,new Oferta(30));
		System.out.println("Precio de prenda1 es " + prenda1.precio());
		System.out.println("prenda1 es..." + prenda1.getRubro());
		
		Prenda prenda2 = new Prenda(Rubro.SACO,new Liquidacion());
		System.out.println("Precio de prenda2 es " + prenda2.precio());
		System.out.println("prenda2 es..." + prenda2.getRubro());
		
		Prenda prenda3 = new Prenda(Rubro.PANTALON,new Nueva());
		System.out.println("Precio de prenda3 es " + prenda3.precio());
		System.out.println("prenda3 es..." + prenda3.getRubro());
		
		Item item1 = new Item(prenda1,6);
		System.out.format(Locale.ENGLISH,"Importe de item1 es " + "%.2f%n", item1.importe());
		
		Item item2 = new Item(prenda2,3);
		System.out.format(Locale.ENGLISH,"Importe de item2 es " + "%.2f%n", item2.importe());
		
		Item item3 = new Item(prenda3,5);
		System.out.format(Locale.ENGLISH,"Importe de item3 es " + "%.2f%n", item3.importe());
		
		List<Item> itemsVenta = new ArrayList<>();
		itemsVenta.add(item1);
		itemsVenta.add(item2);
		itemsVenta.add(item3);
		LocalDate fechaVenta = LocalDate.now();
		
		Venta venta1 = new Venta(itemsVenta,fechaVenta);
		System.out.println("Fecha de venta1 es " + venta1.getFecha());
		System.out.println("Importe de venta1 es " + venta1.importe());
		
		Venta venta2 = new VentaConTarjeta(itemsVenta,fechaVenta,2,5);
		System.out.println("Fecha de venta2 es " + venta2.getFecha());
		System.out.println("Importe de venta2 es " + venta2.importe());
		
		LocalDate fechaAux = LocalDate.of(2017,3,24);
		
		negocio.registrarVenta(venta1);
		negocio.registrarVenta(venta2);
		
		System.out.println("Ganancias del dia " + fechaAux + ": " + negocio.gananciasDeUnDia(fechaAux));	
		
	}

}
