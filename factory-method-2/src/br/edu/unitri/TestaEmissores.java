package br.edu.unitri;

public class TestaEmissores {

	public static void main(String[] args) {

		//EmissorCreator creator = new EmissorCreator();

		// SMS
		EmissorCreator creator = new EmissorAssincronoCreator ();
		Emissor emissor = creator.create(EmissorCreator.SMS);
		emissor.envia("Factory method em ação");

		// Email
		EmissorCreator creator2 = new EmissorAssincronoCreator ();
		Emissor emissor2 = creator2.create(EmissorCreator.EMAIL);
		emissor2.envia("Factory method em ação");

		// JMS
		EmissorCreator creator3 = new EmissorSincronoCreator ();
		Emissor emissor3 = creator3.create(EmissorCreator.JMS);
		emissor3.envia("Factory method em ação");
	}

}
