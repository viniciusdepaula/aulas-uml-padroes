package br.edu.unitri;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class TestaPrototype {

	public static void main(String[] args) {
		String nome = "Pós Graduação";
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 3);
		Set<String> hashSet = new HashSet<String>();

		hashSet.add("Aula");
		hashSet.add("Design Patterns");
		hashSet.add("Unitri");

		Campanha campanha = new Campanha(nome, vencimento, hashSet);
		System.out.println(campanha);

		Campanha clone = campanha.clone();
		System.out.println(clone);
	}
}
