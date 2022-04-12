package uni;



public  class Pie extends UnidadesDeMedida{

	public Pie(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Metro toMetro() {
		return new Metro(this.valor/3.281);
	}

	@Override
	public Kilometro toKilometro() {
		return new Kilometro(this.valor/3281);
	}

	@Override
	public Pie toPie() {
		return this;
	}

	@Override
	public Milla toMilla() {
		return new Milla(this.valor/5280);
	}

	@Override
	public String toString() {
		return this.valor + " ft";
	}

	@Override
	public UnidadesDeMedida sumar(UnidadesDeMedida otra) {
		return new Pie(this.valor + otra.toMetro().valor);
	}

	@Override
	public UnidadesDeMedida enMiUnidad(UnidadesDeMedida otra) {
		return otra.toPie();
	}

	@Override
	public UnidadesDeMedida crear(double valor) {
		return new Metro(valor);
	}


}

