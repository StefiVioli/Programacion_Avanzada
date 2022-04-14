package archivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

import explorador.Explorador;

public class Archivo {

	public String nombre;

	public Archivo(String nombre) {
		this.nombre = nombre;
	}

	public Explorador[] leerArchivo(int n) {
		Scanner scanner = null;
		Explorador[] exploradores = null;
		Explorador[] expMasRepetidos = null;

		try {
			File file = new File("casos de prueba/in/" + this.nombre + ".in");
			scanner = new Scanner(file);

			scanner.useLocale(Locale.ENGLISH);
			int pos, j = 0;
			int cantExp = scanner.nextInt();// leo cantidad de exploradores
			exploradores = new Explorador[cantExp];
			//n = scanner.nextInt();// leo el n
			Explorador Exp = new Explorador();
			Exp.nombre = scanner.nextLine();
			Exp.nombre = scanner.nextLine();
			exploradores[j] = new Explorador(Exp.nombre, 1);
			j++;

			for (int i = 1; i < cantExp; i++) {
				Exp.nombre = scanner.nextLine();
				pos = esNombreRepetido(Exp, exploradores);
				if (pos == -1)// si el nombre no existia en mi vector lo cargo
				{

					exploradores[j] = new Explorador(Exp.nombre, 1);
					j++;
				}
				// ya existia el nombre incremento repeticiones
				else {
					exploradores[pos].repeticiones++;
				}

				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		expMasRepetidos = buscarNRepetidos(exploradores, n);
		return expMasRepetidos;
		//return exploradores;
	}

	private Explorador[] buscarNRepetidos(Explorador[] exploradores, int n) {
		Explorador[] expRepetidos = new Explorador[n];
		int posMayor;
		for(int i =0; i< n; i++) {
			posMayor=buscarMayor(exploradores);
			expRepetidos[i] = new Explorador(exploradores[posMayor].nombre, exploradores[posMayor].repeticiones);
			eliminarMayor(exploradores,posMayor);
		}
		
		

		return expRepetidos;
	}

	private void eliminarMayor(Explorador[] exploradores, int posMayor) {
		exploradores[posMayor].repeticiones = 0;//lo pongo en cero para que no lo contabilice mas		
	}


	private int buscarMayor(Explorador[] exploradores) {
		int posMayor = 0,
			maxRep = exploradores[posMayor].repeticiones;
		for(int i = 1; i<exploradores.length; i++)
		{
			if(exploradores[i] != null && (exploradores[i].compararRepeticiones(maxRep)) > 0)
			{
				posMayor=i;
				maxRep = exploradores[posMayor].repeticiones;
				
			}
		}
		return posMayor;

		//expRepetidos[0] = new Explorador(exploradores[0].nombre,exploradores[0].repeticiones);
		
		
		/*
		 * for (int i = 1; i < exploradores.length; i++) {
		 * if(exploradores[i].repeticiones.equals() expRepetidos[i] = exploradores[i]; }
		 * //
		 *///	  if(expRepetidos[i].repeticiones < exploradores[i].repeticiones)

	}

	private int esNombreRepetido(Explorador nombreExp, Explorador[] exploradores) {
		int i = 0;
		while (exploradores[i] != null && (i < exploradores.length) && (exploradores[i].equals(nombreExp) == false)) {
			i++;
		}
		if (exploradores[i] != null && (exploradores[i].equals(nombreExp) == true)) {
			return i;// lo encontre en el vector y devuelvo la posicion
		} else
			return -1;// no esta en el vector
	}

	public void guardarArchivo(Explorador[] exploradores) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter("casos de prueba/out/" + this.nombre + ".out");
			printerWriter = new PrintWriter(file);

			for (int i = 0; i < exploradores.length; i++) {
				if (exploradores[i] != null)
					printerWriter.println(exploradores[i].nombre + " " + exploradores[i].repeticiones);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

	public int obtenerExploradores() {
		Scanner scanner = null;
		int cantExp;

		try {
			File file = new File("casos de prueba/in/" + this.nombre + ".in");
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);
		}

		catch (Exception e) {
			e.printStackTrace();

		}
		cantExp = scanner.nextInt();// leo cantidad de exploradores

		scanner.close();

		return cantExp;

	}

	public int obtenerN() {
		Scanner scanner = null;
		int cant;

		try {
			File file = new File("casos de prueba/in/" + this.nombre + ".in");
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);
		}

		catch (Exception e) {
			e.printStackTrace();

		}
		cant = scanner.nextInt();
		cant = scanner.nextInt();
		scanner.close();
		return cant;
	}
}
