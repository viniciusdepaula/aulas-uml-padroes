package br.edu.unitri;

public class TesteRecibo {

	public static void main(String[] args) {
		Recibo recibo = new Recibo("K19 Treinamentos", "Marcelo Martins", 1);
		recibo.geraArquivo();
	}
}