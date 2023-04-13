package tp03.ejercicio3;

import tp03.ejercicio2.ArbolBinario;
import tp03.ejercicio2.Imprimir;

public class principal {

	public static void main(String[] args) {
		ArbolBinario<Integer> arbol = new ArbolBinario<Integer> (3);
		ArbolBinario<Integer> hijoIzq = new ArbolBinario<>(21);
		ArbolBinario<Integer> hijoDer = new ArbolBinario<>(3);
		hijoIzq.agregarHijoIzquierdo(new ArbolBinario<>(42));
		hijoIzq.agregarHijoDerecho(new ArbolBinario<>(8));
		hijoDer.agregarHijoIzquierdo(new ArbolBinario<>(6));
		arbol.agregarHijoIzquierdo(hijoIzq);
		arbol.agregarHijoDerecho(hijoDer);
	
		ContadorArbol cont = new ContadorArbol (arbol);
		
		Imprimir.imprimirLista(cont.numerosParesInOrden(arbol));
		Imprimir.imprimirLista(cont.numerosParesPostOrden(arbol));

	}

}
