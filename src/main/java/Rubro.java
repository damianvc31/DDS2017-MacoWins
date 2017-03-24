
public enum Rubro {
	CAMISA(100),
	PANTALON(200),
	SACO(500);
	
	private final double precioBase;
	
	private Rubro(final double precioBase) { this.precioBase = precioBase; }
	public double getPrecioBase() {
		return precioBase;
	}
	
}



