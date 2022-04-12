package unid;

public class Kilometro {

	private double valor;
	
	
	
	public Kilometro(double valor) {
		super();
		this.valor = valor;
	}

	public Metro toMetro(){
		return new Metro(this.valor * 1000);
	}
	
	public Pie toPie(){
		return new Pie(this.valor * 3281);
	}
	
	public Milla toMilla(){
		return new Milla(this.valor / 1609);
	}

	@Override
	public String toString() {
		return this.valor + " km";
	}
	
	
}
