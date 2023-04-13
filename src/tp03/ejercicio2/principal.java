package tp03.ejercicio2;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio3.ContadorArbol;

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
	
	
		arbol.imprimir(arbol);
		System.out.println("----------------------");
		arbol.imprimir(arbol.espejo());
		System.out.println("Cantidad de hojas: "+ arbol.contarHojas());
		System.out.println("----------------------");
		arbol.entreNiveles(1, 2);

	}
	

}
