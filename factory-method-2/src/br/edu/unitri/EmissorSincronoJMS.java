package br.edu.unitri;

public class EmissorSincronoJMS implements Emissor {

	@Override
	public void envia(String mensagem) {

		System.out.println("Enviando por JMS e de forma síncrona a mensagem: ");
		System.out.println(mensagem);
	}

}
