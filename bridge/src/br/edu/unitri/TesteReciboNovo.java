package br.edu.unitri;

public class TesteReciboNovo {

	public static void main(String[] args) {
		GeradorDeArquivo geradorDeArquivoTXT = new GeradorDeArquivoTXT();
		ReciboNovo recibo = new ReciboNovo("K19 Treinamentos", "Marcelo Martins", 1, geradorDeArquivoTXT);
		recibo.geraArquivo();
	}
}