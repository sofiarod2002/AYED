package ejercicio1;

import ejercicio1.ejercicio2.Cola;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 
	private int hojas=0;

	
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

	//Devuelve la cantidad de árbol/subárbol hojas del árbol receptor.
	public int contarHojas() {
		if (!this.esVacio()) {
		if (this.esHoja()) {
			return 1;
			}else {
				if (this.tieneHijoDerecho()) {
					hojas += this.hijoDerecho.contarHojas();
				}
				if (this.tieneHijoIzquierdo()) {
					hojas += this.hijoIzquierdo.contarHojas();
				}
			}
		
		}	return hojas;
	}
	
	
	//Devuelve el árbol binario espejo del árbol receptor. Por ejemplo:
    public ArbolBinario<T> espejo() {
		ArbolBinario<T> a = new ArbolBinario<T>();
    	if (!this.esVacio()) {
			if (this.tieneHijoDerecho()) {
				a.agregarHijoIzquierdo(this.hijoDerecho.espejo());
			}
			if (this.tieneHijoIzquierdo()) {
				a.agregarHijoDerecho(this.hijoIzquierdo.espejo());
			}
			
		}
    	return a;
	}

    //entreNiveles(int n, m) Imprime el recorrido por niveles de los elementos del árbol receptor entre los niveles n y m (ambos inclusive). (0≤n<m≤altura del árbol)
	public void entreNiveles(int n, int m){
		Cola <ArbolBinario<T>> cola = new Cola <ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null);
		
		int nivel = 0;
		while (!cola.esVacia() && (cola.desencolar() !=null)) {
			if (nivel > n && nivel < m) {
				System.out.println(this.dato);
			}
			if(this.tieneHijoDerecho()) {
				cola.encolar(this.getHijoDerecho());
			}
			if(this.tieneHijoIzquierdo()) {
				cola.encolar(this.getHijoIzquierdo());
			}
		}
		if (!cola.esVacia()) {
			nivel++;
			cola.encolar(null);
		}
	}

	

}
