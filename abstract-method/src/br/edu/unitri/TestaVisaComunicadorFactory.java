package br.edu.unitri;

public class TestaVisaComunicadorFactory {
	
	public static void main(String[] args) {
		
		ComunicadorFactory comunicadorFactory = new VisaComunicadorFactory();
		String transacao = "Valor=56 ;Senha=123";
		
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia(transacao);
		
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}

}
