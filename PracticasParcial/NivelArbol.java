package PracticasParcial;

import tp02.ejercicio2.Cola;
import tp03.ejercicio2.ArbolBinario;

//EJERCICIO 6
public class NivelArbol {
	private ArbolBinario <Integer> arbol = new ArbolBinario <Integer>();
	
	public ArbolBinario<Integer> minEnNivelAB(int nivel){
		return minEnNivelAB (arbol,nivel);
	}
	
	private ArbolBinario<Integer> minEnNivelAB (ArbolBinario<Integer> arbol, int nivel){
		Cola<ArbolBinario<Integer>> cola = new Cola<ArbolBinario<Integer>>();
		cola.encolar(arbol);
		cola.encolar(null);
		ArbolBinario<Integer> nodo = new ArbolBinario<Integer>();
		
		nodo =null; int n=0; int minimo=999;
		
		while (!cola.esVacia()) {
			while (!cola.esVacia() && (arbol = cola.desencolar())!= null) {
				if (nivel == n) {
					if (arbol.esHoja())
						minimo = Math.min(minimo, arbol.getDato());
					if (minimo == arbol.getDato())
						nodo = arbol;
				}else {
					if (arbol.tieneHijoIzquierdo()) 
						cola.encolar(arbol.getHijoIzquierdo());
					if (arbol.tieneHijoDerecho()) 
						cola.encolar(arbol.getHijoDerecho());
				}
			}
			if (!cola.esVacia()) {
				cola.encolar(null);
				n++;
			}
		}
		return nodo;
	}
	
}
