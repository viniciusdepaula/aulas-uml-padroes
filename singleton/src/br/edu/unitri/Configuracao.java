package br.edu.unitri;

import java.util.HashMap;
import java.util.Map;

public class Configuracao {
	private Map<String, String> propriedades;
	
	/*
	 * Atributo que armazena a única instância da classe
	 */
	
	private static Configuracao instance;

	/*
	 * Construtor privado com o intuito de se evitar a criação acidental de outras instâncias
	 */
	private Configuracao() {
		this.propriedades = new HashMap<String, String>();
		this.propriedades.put("time -zone", "America/Sao_Paulo");
		this.propriedades.put("currency -code", "BRL");
	}

	/*
	 * Uma única instância só pode ser obtida pela chamada do método getInstance()
	 */
	public static Configuracao getInstance() {
		if (Configuracao.instance == null) {
			Configuracao.instance = new Configuracao();
		}
		return Configuracao.instance;
	}

	public String getPropriedade(String nomeDaPropriedade) {
		return this.propriedades.get(nomeDaPropriedade);
	}
}