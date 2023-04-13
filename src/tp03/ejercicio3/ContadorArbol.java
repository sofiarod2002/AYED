package tp03.ejercicio3;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio2.ArbolBinario;

public class ContadorArbol {
	private ArbolBinario<Integer> a;  
	private ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer> ();
	ContadorArbol (ArbolBinario<Integer> a){
		this.a = a;
	}
	
	public boolean esPar (int x) {
		if (x%2 == 0) {
			return true;
		}else
			return false;
	}
	
	public ListaEnlazadaGenerica<Integer> numerosParesInOrden(ArbolBinario<Integer> a){
		if (a.tieneHijoIzquierdo()) {
			this.numerosParesInOrden(a.getHijoIzquierdo());		
		}
		if (esPar(a.getDato())) {
			lista.agregarFinal(a.getDato());
		}
		if (a.tieneHijoDerecho()) {
			this.numerosParesInOrden(a.getHijoDerecho());
		}
		return lista;
	}
	
	
	public ListaEnlazadaGenerica<Integer> numerosParesPostOrden(ArbolBinario<Integer> a){
		if (a.tieneHijoIzquierdo()) {
			this.numerosParesPostOrden(a.getHijoIzquierdo());		
		}
		if (a.tieneHijoDerecho()) {
			this.numerosParesPostOrden(a.getHijoDerecho());
		}
		if (esPar(a.getDato())) {
			lista.agregarFinal(a.getDato());
		}
		return lista;
	}
	

	
}
