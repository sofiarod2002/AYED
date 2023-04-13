package tp03.ejercicio2;
import tp02.*;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 
	private int cantHojas=0;
	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	
	
	public int contarHojas() {
		if (!this.esVacio()) {
			if (this.esHoja()) {
				cantHojas++;
				System.out.print(cantHojas);
			}
			if (this.tieneHijoDerecho()) {
				this.hijoDerecho.contarHojas();
			}
			if (this.tieneHijoIzquierdo()) {
				this.hijoIzquierdo.contarHojas();
			}
		}
		return cantHojas;
	}
	
    public ArbolBinario<T> espejo() {
		ArbolBinario<T> a = new ArbolBinario <T> (this.getDato());
		if (this.tieneHijoDerecho()) {
			a.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
			}
		if (this.tieneHijoIzquierdo()) {
			a.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
			}
		return a;
	}
    

	public void entreNiveles(int n, int m){
		ArbolBinario<T> a = null;
		Cola<ArbolBinario<T>> cola = new Cola<ArbolBinario<T>>();
		cola.encolar(this);
		
		int nivel = 0;
		
		// si n >= 0 && m < this.altura entonces hago el resto
		while (!cola.esVacia()){
			while (!cola.esVacia() && (a = cola.desencolar()) != null && (nivel <= m)) {
				cola.desencolar();
				if (nivel >= n)
					System.out.print(a.getDato()+", ");
				if (a.tieneHijoIzquierdo())
					cola.encolar(a.getHijoIzquierdo());
				if (a.tieneHijoDerecho())
					cola.encolar(a.getHijoDerecho());
				
				if (!cola.esVacia()) {
					nivel++;
					cola.encolar(null);
				}
			}
		}

	}
	

	
	public void imprimir (ArbolBinario<T> arbol) {
		System.out.println(arbol.getDato());
		if (arbol.tieneHijoIzquierdo()) {
			this.imprimir(arbol.getHijoIzquierdo());		
		}
		
		if (arbol.tieneHijoDerecho()) {
			this.imprimir(arbol.getHijoDerecho());
		}
	}
		

	

}
