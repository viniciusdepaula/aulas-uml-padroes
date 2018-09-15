package br.edu.unitri;

public class EmissorSincronoEmail implements Emissor {

	@Override
	public void envia(String mensagem) {

		System.out.println("Enviando por Email e de forma síncrona a mensagem: ");
		System.out.println(mensagem);

	}

}
