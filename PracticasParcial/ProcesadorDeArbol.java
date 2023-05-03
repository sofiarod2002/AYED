package PracticasParcial;

import tp03.ejercicio2.ArbolBinario;
//PROGRAMACION 1
public class ProcesadorDeArbol {
	private ArbolBinario <Integer> arbol;
	
	public ProcesadorDeArbol() {
		arbol = new ArbolBinario<Integer> (3);
		ArbolBinario<Integer> hijoIzq = new ArbolBinario<>(22);
		ArbolBinario<Integer> hijoDer = new ArbolBinario<>(3);
		hijoIzq.agregarHijoIzquierdo(new ArbolBinario<>(42));
		hijoIzq.agregarHijoDerecho(new ArbolBinario<>(8));
		hijoDer.agregarHijoIzquierdo(new ArbolBinario<>(6));
		arbol.agregarHijoIzquierdo(hijoIzq);
		arbol.agregarHijoDerecho(hijoDer);
	}
	
	public Dato procesar () {
		Dato dato = new Dato();
		procesar (arbol,dato);
		return dato;
	}
	
	private Dato procesar (ArbolBinario<Integer> arbol, Dato dato) {
		if (esPar(arbol.getDato())) {
			dato.sumar();
			if (arbol.tieneHijoIzquierdo() && arbol.tieneHijoDerecho())
				dato.setLista (arbol);
		}
		if (arbol.tieneHijoIzquierdo())
			procesar(arbol.getHijoIzquierdo(),dato);
		if (arbol.tieneHijoDerecho())
			procesar(arbol.getHijoDerecho(),dato);
		return dato;
		}
	
	private boolean esPar (int x) {
		return (x % 2 == 0)?true:false;
	}
	

}
