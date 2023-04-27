package tp04.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04_ag.src.tp04.ejercicio1.ArbolGeneral;


public class principal {

	public static void main(String[] args) {
		ArbolGeneral<Integer> arbol = new ArbolGeneral<> (9);
		ArbolGeneral<Integer> hijo = new ArbolGeneral<>(3);
		ArbolGeneral<Integer> hijo2 = new ArbolGeneral<>(7);
		ArbolGeneral<Integer> hijo3 = new ArbolGeneral<>(21);
		ArbolGeneral<Integer> hijo4 = new ArbolGeneral<>(50);
		ArbolGeneral<Integer> hijo5 = new ArbolGeneral<>(11);
		arbol.agregarHijo(hijo);
		arbol.agregarHijo(hijo2);
		arbol.agregarHijo(hijo3);
		hijo.agregarHijo(hijo5);
		hijo2.agregarHijo(hijo3);
		hijo3.agregarHijo(hijo4);
		RecorridosAG rec = new RecorridosAG();
		ListaGenerica<Integer> impares = new ListaEnlazadaGenerica<Integer>();
		impares = rec.numerosImparesMayoresQuePorNiveles(arbol, 5);
		while (!impares.fin()) {
			System.out.println(impares.proximo());
		}

	}

}
