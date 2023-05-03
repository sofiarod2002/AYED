package PracticasParcial;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04_ag.src.tp04.ejercicio1.ArbolGeneral;

public class Parcial5 {

	public ListaEnlazadaGenerica<String>caminosPares (ArbolGeneral<Character> arbol){
		ListaEnlazadaGenerica<String> lista = new ListaEnlazadaGenerica<String> ();
		Auxi aux = new Auxi();
		
		if (arbol.esHoja()) {
			if (esPar(aux.getCant()))
				lista.agregarFinal(aux.getPalabra());
			aux.reset();
		}else {
			aux.sumar();
			aux.agregarLetra(arbol.getDato());
		}
		
		if (arbol.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Character>> hijos = arbol.getHijos();
			hijos.comenzar();
			while (!hijos.fin()) 
				caminosPares(hijos.proximo());
		}
		return lista;
	}
	
	private boolean esPar (int x) {
		return (x % 2 == 0)?true:false;
	}
	
}
