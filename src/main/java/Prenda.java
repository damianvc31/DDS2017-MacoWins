
public class Prenda {
	private final Rubro rubro;
	private Estado estado;
	
	public Prenda(final Rubro rubro, Estado estado){
		this.rubro = rubro;
		this.estado = estado;
	}
	
	public double precio(){
		return estado.precioFinal(rubro.getPrecioBase());
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Rubro getRubro() {
		return rubro;
	}
}
