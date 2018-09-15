package br.edu.unitri;

public class EmissorAssincronoJMS implements Emissor {

	@Override
	public void envia(String mensagem) {

		System.out.println("Enviando por JMS e de forma assíncrona a mensagem: ");
		System.out.println(mensagem);
	}

}
