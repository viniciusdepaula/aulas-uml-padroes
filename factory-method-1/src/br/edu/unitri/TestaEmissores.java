package br.edu.unitri;

public class TestaEmissores {

	public static void main(String[] args) {

		EmissorCreator creator = new EmissorCreator();

		// SMS
		Emissor emissor1 = creator.create(EmissorCreator.SMS);
		emissor1.envia("Factory method em ação");

		// Email
		Emissor emissor2 = creator.create(EmissorCreator.EMAIL);
		emissor2.envia("Factory method em ação");

		// JMS
		Emissor emissor3 = creator.create(EmissorCreator.JMS);
		emissor3.envia("Factory method em ação");
	}

}
