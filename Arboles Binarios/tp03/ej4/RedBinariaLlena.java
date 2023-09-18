package tp03.ej4;

import ejercicio1.ArbolBinario;

public class RedBinariaLlena {
private ArbolBinario<Integer> red;


	
	public RedBinariaLlena(ArbolBinario<Integer> red) {
		this.red = red;
	}



	public int reatrdoReenvio () {
		int maximo = Integer.MIN_VALUE;
		retardoReenvio (maximo,red);
		return 0;
	}
	
	private int retardoReenvio (int maximo, ArbolBinario<Integer> a) {
		int iz=0, de=0;
		if (a.esVacio()) {
			return 0;
		}else {
			if (a.tieneHijoDerecho()) {
				de += retardoReenvio(maximo, a.getHijoDerecho());
			}
			if (a.tieneHijoIzquierdo()) {
				iz += retardoReenvio (maximo, a.getHijoIzquierdo());
			}
		}
		return Math.max(iz, de);
	}
}
