package unid;

public class Milla {
	private double valor;

	public Milla(double valor) {
		super();
		this.valor = valor;
	}
	
	public Metro toMetro(){
		return new Metro(this.valor*1609);
	}
	
	public Kilometro toKilometro(){
		return new Kilometro(this.valor*1.609);
	}
	
	

	public Pie toPie(){
		return new Pie(this.valor*5280);
	}
	
	@Override
	public String toString() {
		return this.valor + " mi";
	}
	
	
}
