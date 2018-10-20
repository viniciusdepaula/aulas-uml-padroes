package br.edu.unitri;

/*
 * Define os objetos que terão as chamadas aos seus métodos controladas.
 */

public class Player {

	public void play(String filename) throws InterruptedException {

		System.out.println("Tocando o arquivo " + filename);
		long duracao = (long) (Math.random() * 2);
		System.out.println("Duração (s) :" + duracao / 1);
		Thread.sleep(duracao);
		System.out.println("Fim");
	}

	public void increaseVolume(int levels) {

		System.out.println("Diminuindo o volume em " + levels);
	}

	public void decreaseVolume(int levels) {
		
		System.out.println("Aumentando o volume em " + levels);
	}
}
