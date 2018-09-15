package br.edu.unitri;

public class EmissorAssincronoEmail implements Emissor {

	@Override
	public void envia(String mensagem) {

		System.out.println("Enviando por Email e de forma assíncrona a mensagem: ");
		System.out.println(mensagem);

	}

}
