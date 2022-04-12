package uni;

public abstract class UnidadesDeMedida {
	protected double valor;
	


	public UnidadesDeMedida(double valor) {
		super();
		this.valor = valor;
	}

	@Override
	public abstract String toString();
	public abstract Metro toMetro();
	public abstract Kilometro toKilometro();
	public abstract Pie toPie();
	public abstract Milla toMilla();

	public abstract UnidadesDeMedida enMiUnidad(UnidadesDeMedida otra);
	public abstract UnidadesDeMedida crear(double valor);
	
	
	/*public abstract UnidadesDeMedida sumar(UnidadesDeMedida u);*/
	
	public UnidadesDeMedida sumar2(UnidadesDeMedida otra) {
		return new Metro(this.toMetro().valor + otra.toMetro().valor);
	}
	
	public  UnidadesDeMedida sumar(UnidadesDeMedida otra){
		return this.crear(this.enMiUnidad(otra).valor + this.valor);
	}
	
	public  UnidadesDeMedida restar(UnidadesDeMedida otra){
		return this.crear(this.enMiUnidad(otra).valor - this.valor);
	}
}

