package br.edu.unitri;

import java.util.ArrayList;
import java.util.List;

/*
 * Caminho é um Trecho e será composto por um ou mais trechos
 */

public class Caminho implements Trecho {

	private List<Trecho> trechos;

	public Caminho() {

		this.trechos = new ArrayList<Trecho>();
	}

	public void adiciona(Trecho trecho) {

		this.trechos.add(trecho);
	}

	public void remove(Trecho trecho) {

		this.trechos.remove(trecho);
	}

	public void imprime() {

		for (Trecho trecho : this.trechos) {

			trecho.imprime();
		}
	}
}
