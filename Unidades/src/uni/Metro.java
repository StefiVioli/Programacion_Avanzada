package uni;


public class Metro extends UnidadesDeMedida{
	
	public Metro(double valor) {
		super(valor);
		
	}

	@Override
	public Metro toMetro() {
		return this;
	}

	@Override
	public Kilometro toKilometro() {
		return new Kilometro(this.valor/1000);
	}

	@Override
	public Pie toPie() {
		return new Pie(this.valor*3.281);
	}

	@Override
	public Milla toMilla() {
		return new Milla(this.valor/1609);
	}

	@Override
	public String toString() {
		return this.valor + " m";
	}

	@Override
	public UnidadesDeMedida sumar(UnidadesDeMedida otra) {
		return new Metro(this.valor + otra.toMetro().valor);
	}

	@Override
	public UnidadesDeMedida enMiUnidad(UnidadesDeMedida otra) {
		return otra.toMetro();
	}

	@Override
	public UnidadesDeMedida crear(double valor) {
		return new Metro(valor);
	}
	

}
