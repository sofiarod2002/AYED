package ejercicio1.ejercicio2;


public class Cola<T> {
	private ListaGenerica<T> lista;
	
	public Cola (){
		lista = new ListaEnlazadaGenerica<T>();
	}
	
	public void encolar (T elem) {
		lista.agregarFinal(elem);
	}
	
	public T desencolar () {
		T aux = lista.proximo();
		lista.eliminar(aux);
		return aux;
	}
	
	public T tope () {
		return lista.elemento(lista.tamanio());
	}
	
	public boolean esVacia() {
		return lista.esVacia();
	}
}
