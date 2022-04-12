package unid;

public class Metro {
	public Metro(double valor) {
		super();
		this.valor = valor;
	}

	private double valor;
	
	public Kilometro toKilometro(){
		return new Kilometro(this.valor/1000);
	}
	
	public Pie toPie(){
		return new Pie(this.valor*3.281);
	}
	
	public Milla toMilla(){
		return new Milla(this.valor/1609);
	}

	@Override
	public String toString() {
		return this.valor + " m";
	}
	
}
