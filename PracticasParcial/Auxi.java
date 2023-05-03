package PracticasParcial;

public class Auxi {
	private String palabra = "";
	private int cant = 0;
	
	public void sumar() {
		cant++;
	}
	
	public void agregarLetra (Character x) {
		palabra += x;
	}

	public String getPalabra() {
		return palabra;
	}

	public int getCant() {
		return cant;
	}
	
	public void reset() {
		cant =0;
		palabra="";
	}


	
	
}
