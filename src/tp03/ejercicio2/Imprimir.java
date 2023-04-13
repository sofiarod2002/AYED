package tp03.ejercicio2;
import tp02.ejercicio2.*;

public class Imprimir {

	public static void imprimirLista (ListaEnlazadaGenerica<Integer> lista) {
		while (!lista.fin()) {
			System.out.println(lista.proximo());
		}
	}
}
