import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

public class NegocioTest {
	private Negocio negocio;
	private Venta[] ventas;
	private Prenda[] prendas;
	private Item[] items;

	@Before
	public void init() {
		negocio = new Negocio();
		ventas = new Venta[5];
		items = new Item[5];
		prendas = new Prenda[5];
		prendas[0] = new Prenda(Rubro.CAMISA, new Oferta(30));
		prendas[1] = new Prenda(Rubro.SACO, new Liquidacion());
		prendas[2] = new Prenda(Rubro.PANTALON, new Nueva());
		items[0] = new Item(prendas[0], 6);
		items[1] = new Item(prendas[1], 3);
		items[2] = new Item(prendas[2], 5);
		List<Item> itemsVenta = new ArrayList<>();
		LocalDate fechaVenta = LocalDate.now();
		itemsVenta.add(items[0]);
		itemsVenta.add(items[1]);
		itemsVenta.add(items[2]);
		ventas[0] = new Venta(itemsVenta, fechaVenta);
		ventas[1] = new VentaConTarjeta(itemsVenta, fechaVenta, 2, 5);
	}

	@Test
	public void venta0Importe() {
		Assert.assertEquals(2170, ventas[0].importe(), 0);
	}

	@Test
	public void negocioTodasVentasDeHoy() {
		negocio.registrarVenta(ventas[0]);
		negocio.registrarVenta(ventas[1]);
		Assert.assertTrue(negocio.getVentas().stream().allMatch(venta -> venta.esDeFecha(LocalDate.now())));
	}

}
