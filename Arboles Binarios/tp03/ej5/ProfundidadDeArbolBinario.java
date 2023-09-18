package tp03.ej5;

import ejercicio1.ArbolBinario;
import ejercicio1.ejercicio2.Cola;

/*
	 Implemente una clase Java llamada ProfundidadDeArbolBinario que tiene como variable de instancia un árbol binario de números enteros y 
	 un método de instancia sumaElementosProfundidad(int p):int el cuál devuelve la suma de todos los nodos del árbol que se encuentren a 
	 la profundidad pasada como argumento.
 */
public class ProfundidadDeArbolBinario {
private ArbolBinario<Integer> arbol;

public ProfundidadDeArbolBinario() {
	this.arbol = new ArbolBinario<Integer>();
}


public int sumaElementosProfundidad (int profundidad) {
	int total =0;
	Cola <ArbolBinario<Integer>> cola = new Cola <ArbolBinario<Integer>>();
	cola.encolar(arbol);
	cola.encolar(null);
	
	int nivel = 0;
	while (!cola.esVacia() && (cola.desencolar() !=null)) {
		if (nivel == profundidad) {
			total += arbol.getDato();
		}
		if(arbol.tieneHijoDerecho()) {
			cola.encolar(arbol.getHijoDerecho());
		}
		if(arbol.tieneHijoIzquierdo()) {
			cola.encolar(arbol.getHijoIzquierdo());
		}
	}
	if (!cola.esVacia()) {
		nivel++;
		cola.encolar(null);
	}
	return total;
}

}
