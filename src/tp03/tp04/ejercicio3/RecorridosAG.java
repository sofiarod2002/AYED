package tp04.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.*;
import tp02.ejercicio2.ListaGenerica;
import tp04_ag.src.tp04.ejercicio1.*;

public class RecorridosAG {

public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden (ArbolGeneral<Integer> a, Integer n){
	ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>(); 
	if ((a.getDato()%2 != 0 ) && (a.getDato() > n)) {
		lista.agregarFinal(a.getDato());
	}
	if (a.tieneHijos()) {
		ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
		lHijos.comenzar();
		while (!lHijos.fin()) {
				this.combinarListas(lista, numerosImparesMayoresQuePreOrden(lHijos.proximo(), n));
			}
	}
	return lista;
}

public ListaGenerica<Integer> numerosImparesMayoresQueInOrden (ArbolGeneral<Integer> a, Integer n){
	ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
	ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>(); 
	if (a.tieneHijos()) {
		lHijos.comenzar();
		this.combinarListas(lista, numerosImparesMayoresQuePreOrden(lHijos.proximo(), n));
	}
	if ((a.getDato()%2 == 0 ) && (a.getDato() > n)) {
			lista.agregarFinal(a.getDato());
	}
	while ((!lHijos.fin())) {
		this.combinarListas(lista, numerosImparesMayoresQuePreOrden(lHijos.proximo(), n));
	}
	return lista;
}

public ListaGenerica< Integer > numerosImparesMayoresQuePostOrden (ArbolGeneral<Integer> a, Integer n){
ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>(); 
lHijos.comenzar();
while (!lHijos.fin()) {
	this.combinarListas(lista, numerosImparesMayoresQuePreOrden(lHijos.proximo(), n));
}
if (!a.esVacio()) {
	if ((a.getDato()%2 == 0 ) && (a.getDato() > n)) {
			lista.agregarFinal(a.getDato());
	}
}
	return lista;
}


public ListaGenerica< Integer > numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer> a, Integer n){
	Cola<ArbolGeneral<Integer>> cola = new Cola<ArbolGeneral<Integer>>();
	ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
	ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
	cola.encolar(a);
	cola.encolar(null);
	while (!cola.esVacia()) {
		ArbolGeneral<Integer> aux = cola.desencolar();
		if (aux != null) {
			if ((a.getDato()%2 != 0 ) && (a.getDato() > n)) {
				System.out.println("adentro: "+a.getDato());
				lista.agregarFinal(a.getDato());
			}
			hijos = aux.getHijos();
			hijos.comenzar();
			while (!hijos.fin()) {
				cola.encolar(hijos.proximo());
			}
		}
	}
	return lista;
	
	}

private void combinarListas(ListaGenerica<Integer> destino, ListaGenerica<Integer> origen) {
	origen.comenzar();
	while (!origen.fin())
		destino.agregarFinal(origen.proximo());
}
}
