package br.edu.unitri;

public class EmissorSincronoSMS implements Emissor {

	@Override
	public void envia(String mensagem) {

		System.out.println("Enviando por SMS e de forma síncrona a mensagem: ");
		System.out.println(mensagem);
	}

}
