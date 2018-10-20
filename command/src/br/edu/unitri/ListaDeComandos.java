package br.edu.unitri;

import java.util.ArrayList;
import java.util.List;

/*
 * Classe que armazena os Commands que devem ser executados.
 */

public class ListaDeComandos {

	private List<Comando> comandos = new ArrayList<Comando>();

	public void adiciona(Comando comando) {
		this.comandos.add(comando);
	}

	public void executa() {
		for (Comando comando : this.comandos) {
			comando.executa();
		}
	}

}
