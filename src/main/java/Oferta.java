
public class Oferta implements Estado {
	private double descuento;
	
	public Oferta(double descuento){
		this.descuento = descuento;
	}
	@Override
	public double precioFinal(double precioBase) {
		return precioBase - descuento;
	}

}
