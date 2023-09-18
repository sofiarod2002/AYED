package tp03.ej3;

import ejercicio1.ArbolBinario;
import ejercicio1.ejercicio2.ListaEnlazadaGenerica;

/* Defina una clase Java denominada ContadorArbol cuya función 
 * principal es proveer métodos de validación sobre árboles binarios de enteros. 
 * Para ello la clase tiene como variable de instancia un ArbolBinario<Integer>. 
 * Implemente en dicha clase un método denominado numerosPares() que devuelve en una estructura adecuada 
 * (sin ningún criterio de orden) todos los elementos pares del árbol (divisibles por 2). Defina la clase dentro del paquete tp03.ejercicio3

b) 
 */
public class ContadorArbol {
private ArbolBinario<Integer> a;

	public ContadorArbol() {
		this.a = new ArbolBinario<Integer>();
	}
	
	//) Implemente el método realizando un recorrido InOrden.

	public ListaEnlazadaGenerica<Integer> numerosParesInOrden() {
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		numerosParesInOrden (a,lista);
		return lista;
	}

	private void numerosParesInOrden (ArbolBinario<Integer> a, ListaEnlazadaGenerica<Integer> lista) {
		if (!a.esVacio()) {
			if (a.tieneHijoIzquierdo()) {
				numerosParesInOrden (a.getHijoIzquierdo(),lista);
			}
			if (esPar (a.getDato())) {
				lista.agregarFinal(a.getDato());
			}
			if (a.tieneHijoDerecho()) {
				numerosParesInOrden (a.getHijoDerecho(),lista);
			}
		}
	}
	
	//Implemente el método realizando un recorrido PostOrden.

	public ListaEnlazadaGenerica<Integer> numerosParesPostOrden() {
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		numerosParesPostOrden (a,lista);
		return lista;
	}

	private void numerosParesPostOrden (ArbolBinario<Integer> a, ListaEnlazadaGenerica<Integer> lista) {
		if (!a.esVacio()) {
			if (a.tieneHijoIzquierdo()) {
				numerosParesPostOrden (a.getHijoIzquierdo(),lista);
			}
			if (a.tieneHijoDerecho()) {
				numerosParesPostOrden (a.getHijoDerecho(),lista);
			}
			if (esPar (a.getDato())) {
				lista.agregarFinal(a.getDato());
			}
		}
	}
	
	public boolean esPar (int num) {
		return (num % 2 == 0) ? true : false;
	}

}
