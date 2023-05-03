package PracticasParcial;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio2.ArbolBinario;
import tp04_ag.src.tp04.ejercicio1.ArbolGeneral;

public class Dato {
	ListaGenerica<ArbolBinario<Integer>> lista = new ListaEnlazadaGenerica<ArbolBinario<Integer>>();
	private int cant =0;
	
	public void sumar () {
		cant++;
	}
	
	public void setLista (ArbolBinario<Integer> arbol) {
		lista.agregarFinal(arbol);
	}
	
	public void mostrar() {
		System.out.println(cant);
		System.out.println(lista);
		
	}
}
