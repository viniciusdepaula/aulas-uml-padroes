package br.edu.unitri;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Recibo implements Documento {

	private String emissor;
	private String favorecido;
	private double valor;

	public Recibo(String emissor, String favorecido, double valor) {
		this.emissor = emissor;
		this.favorecido = favorecido;
		this.valor = valor;
	}

	public void geraArquivo() {
		try {
			PrintStream saida = new PrintStream("recibo.txt");
			saida.println("Recibo: ");
			saida.println("Empresa: " + this.emissor);
			saida.println("Cliente: " + this.favorecido);
			saida.println("Valor: " + this.valor);
			saida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}