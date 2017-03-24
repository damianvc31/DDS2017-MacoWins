
public class Liquidacion implements Estado {

	@Override
	public double precioFinal(double precioBase) {
		return precioBase * 0.5;
	}

}
