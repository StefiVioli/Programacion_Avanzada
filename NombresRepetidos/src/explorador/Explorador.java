package explorador;

import java.util.Objects;

public class Explorador {
	
	
	public String nombre;
	public int repeticiones;
	
	public Explorador(String nombre, int repeticiones) {
		super();
		this.nombre = nombre;
		this.repeticiones = repeticiones;
	}

	public Explorador() {
		nombre = "";
		repeticiones = 0;
		
	}
	
	  

	@Override
	public int hashCode() {
		return Objects.hash(nombre, repeticiones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Explorador other = (Explorador) obj;
		return Objects.equals(nombre, other.nombre);
	}

	public int compararRepeticiones(int maxRep) {
		return this.repeticiones - maxRep;
	}


	}	



