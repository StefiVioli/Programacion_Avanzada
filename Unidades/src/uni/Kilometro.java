package uni;



public class Kilometro extends UnidadesDeMedida{

	public Kilometro(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Metro toMetro() {
		return new Metro(this.valor * 1000);
	}

	@Override
	public Kilometro toKilometro() {
		return this;
	}

	@Override
	public Pie toPie() {
		return new Pie(this.valor * 3281);
	}

	@Override
	public Milla toMilla() {
		return new Milla(this.valor / 1609);
	}

	@Override
	public String toString() {
		return this.valor + " km";
	}

	@Override
	public UnidadesDeMedida sumar(UnidadesDeMedida otra) {
		return new Kilometro(this.valor + otra.toMetro().valor);
	}
	

	@Override
	public UnidadesDeMedida enMiUnidad(UnidadesDeMedida otra) {
		return otra.toMetro();
	}

	@Override
	public UnidadesDeMedida crear(double valor) {
		return new Kilometro(valor);
	}
	

}
