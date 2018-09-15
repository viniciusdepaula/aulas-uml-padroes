package br.edu.unitri;

/*
 * Classe que implementa Abstract Factory e aciona os Factory Methods para criar os emissores e receptores.
 */

public class VisaComunicadorFactory implements ComunicadorFactory {

	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();

	public Emissor createEmissor() {
		return emissorCreator.create(EmissorCreator.VISA);
	}

	public Receptor createReceptor() {
		return receptorCreator.create(ReceptorCreator.VISA);
	}

}
