package uni;

public class App {
public static void main(String[] args) {
	Metro a = new Metro(10);
	Kilometro x = a.toKilometro();
	
	System.out.println(a);
	System.out.println(a.toPie());
	System.out.println(a.toMilla());
	System.out.println(a.toKilometro());
	
	Metro metro1 = new Metro(100);
	Kilometro k = new Kilometro(100);
	Milla m = new Milla(100);
	Pie p = new Pie(100);
	Metro metro2 = new Metro(100);
	
	UnidadesDeMedida[] medidas = {metro1, k, m,p};
	
	for(UnidadesDeMedida medida : medidas){
		System.out.println(medida.toMetro());
		
	}
		
	//UnidadesDeMedida.sumar(k,m);
	k.sumar(m);
	
	
}

}
