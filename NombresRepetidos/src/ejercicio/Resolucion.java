package ejercicio;

import archivo.Archivo;
import explorador.Explorador;

public class Resolucion {

	public void resolver(String nombreArch) {
		Archivo archivo = new Archivo(nombreArch);
		//creo vector de exploradores
		//leo de arch y lo paso a vector
		int numExp = archivo.obtenerExploradores();
		int n = archivo.obtenerN();
		Explorador[] exploradores = new Explorador[numExp];
		exploradores = archivo.leerArchivo(n);
		archivo.guardarArchivo(exploradores);
		
	}

}
