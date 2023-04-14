package tp03.ejercicio4;

import tp03.ejercicio2.ArbolBinario;

public class RedBinariaLlena {
	
	public int  retardoReenvio(ArbolBinario<Integer> a) {
		int iz=0; int de = 0;
		if  (a.esVacio()) {
			return 0;
		}else {
			if (a.tieneHijoIzquierdo()) {
				iz += this.retardoReenvio(a.getHijoIzquierdo());
			}
			if (a.tieneHijoDerecho()) {
				de += this.retardoReenvio(a.getHijoDerecho());
			}
		}
		return Math.max(iz, de) + a.getDato();
	}
}
