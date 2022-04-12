package uni;



public class Milla extends UnidadesDeMedida{

	public Milla(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Metro toMetro() {
		return new Metro(this.valor*1609);
	}

	@Override
	public Kilometro toKilometro() {
		return new Kilometro(this.valor*1.609);
	}

	@Override
	public Pie toPie() {
		return new Pie(this.valor*5280);
	}

	@Override
	public Milla toMilla() {
		return this;
	}

	@Override
	public String toString() {
		return this.valor + " mi";
	}

	@Override
	public UnidadesDeMedida sumar(UnidadesDeMedida otra) {
		return new Milla(this.valor + otra.toMetro().valor);
	}
	
	@Override
	public UnidadesDeMedida enMiUnidad(UnidadesDeMedida otra) {
		return otra.toMilla();
	}

	@Override
	public UnidadesDeMedida crear(double valor) {
		return new Milla(valor);
	}

}

