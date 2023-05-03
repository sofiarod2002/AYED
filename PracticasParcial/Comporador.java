package PracticasParcial;

import tp02.ejercicio2.Cola;
import tp02.ejercicio2.ListaGenerica;
import tp04_ag.src.tp04.ejercicio1.ArbolGeneral;
//EJERCICIO 3
public class Comporador {
	
	
	public ArbolGeneral<Integer> comprobarCreciente (ArbolGeneral<Integer>arbol) {
		Cola<ArbolGeneral<Integer>> cola = new Cola<>();
		cola.encolar(arbol);
		cola.encolar(null);
		
		int max= -1; int nivel = 0; 
		ArbolGeneral<Integer> nodo= null;
		ArbolGeneral<Integer> nodoMAXIMO = null;
		while (!cola.esVacia()) {
			int cantHijos = 0; 
			ArbolGeneral<Integer> actual; 
			actual = cola.desencolar();
			while (!cola.esVacia() && (actual = cola.desencolar())  != null) {
				cantHijos++;
				if (actual.tieneHijos()) {
					ListaGenerica<ArbolGeneral<Integer>> hijos = actual.getHijos();
					hijos.comenzar();
					while (!hijos.fin())
						cola.encolar(hijos.proximo());
				}
				nodo = actual;
			}
			if (cantHijos-1 != nivel) {
				return null;
			}
			max = Math.max(max, cantHijos);
			if (cantHijos == max) {
				System.out.println ("entre"+actual);
				nodoMAXIMO = nodo;
			}
			
			
			if (!cola.esVacia())
				cola.encolar(null);
				nivel++;
		}
		return nodoMAXIMO;
	}
}
