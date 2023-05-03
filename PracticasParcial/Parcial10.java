package PracticasParcial;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio2.ArbolBinario;

public class Parcial10 {

	public ListaEnlazadaGenerica<Integer> resolver (ArbolBinario<Integer> arbol){
		 ListaEnlazadaGenerica<Integer> lista = new  ListaEnlazadaGenerica<Integer>();
		 
		 if (arbol.tieneHijoIzquierdo() && arbol.tieneHijoDerecho()) {
			 if (cantHijos (arbol.getHijoDerecho()) == cantHijos(arbol.getHijoIzquierdo()))
				 lista.agregarFinal(arbol.getDato());
		 }
			if (arbol.tieneHijoIzquierdo())
				resolver(arbol.getHijoIzquierdo());
			if (arbol.tieneHijoDerecho())
				resolver(arbol.getHijoDerecho());
			
			return lista;
	}
	
	private int cantHijos (ArbolBinario<Integer> arbol) {
		if (arbol.tieneHijoIzquierdo() && arbol.tieneHijoDerecho()) 
			return 2;
		else if (arbol.tieneHijoIzquierdo() || arbol.tieneHijoDerecho()) 
			return 1;
		else
			return 0;
		}
}

