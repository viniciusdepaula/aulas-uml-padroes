package br.edu.unitri;

public class EmissorAssincronoSMS implements Emissor {

	@Override
	public void envia(String mensagem) {

		System.out.println("Enviando por SMS e de forma assíncrona a mensagem: ");
		System.out.println(mensagem);
	}

}
