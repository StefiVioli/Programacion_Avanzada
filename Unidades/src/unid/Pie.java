package unid;

public class Pie {
	private double valor;

	public Pie(double valor) {
		super();
		this.valor = valor;
	}
	
	public Milla toMilla(){
		return new Milla(this.valor/5280);
	}

	
	public Metro toMetro(){
		return new Metro(this.valor/3.281);
	}
	
	public Kilometro toKilometro(){
		return new Kilometro(this.valor/3281);
	}
	
	@Override
	public String toString() {
		return this.valor + " ft";
	}
}
