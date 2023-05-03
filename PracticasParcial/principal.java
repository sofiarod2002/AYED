package PracticasParcial;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio2.ArbolBinario;
import tp04_ag.src.tp04.ejercicio1.ArbolGeneral;


public class principal {

	public static void main(String[] args) {
		ArbolGeneral<Integer> arbol = new ArbolGeneral<> (9);
		ArbolGeneral<Integer> hijo = new ArbolGeneral<>(3);
		ArbolGeneral<Integer> hijo2 = new ArbolGeneral<>(7);
		ArbolGeneral<Integer> hijo3 = new ArbolGeneral<>(21);
		ArbolGeneral<Integer> hijo4 = new ArbolGeneral<>(50);
		ArbolGeneral<Integer> hijo5 = new ArbolGeneral<>(6);
		ArbolGeneral<Integer> hijo6 = new ArbolGeneral<>(11);
		//9
		arbol.agregarHijo(hijo);
		arbol.agregarHijo(hijo2);
		
	
		Comporador comparador = new Comporador();
		//System.out.println(comparador.comprobarCreciente(arbol));
		
		//-----------------------------------------------------------------
		ProcesadorDeArbol procesador = new ProcesadorDeArbol ();
		
		procesador.procesar().mostrar();

	}

}
