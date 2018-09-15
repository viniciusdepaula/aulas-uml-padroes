package br.edu.unitri;

/*
 * Abstração dos objetos que possuem a capacidade de se auto copiar.
 */

public interface Prototype <T> {
	
	T clone();
}
