package br.edu.unitri;

/*
 * Classe que implementa as fábricas de receptores.
 */

public class ReceptorCreator {

	public static final int VISA = 0;
	public static final int MASTERCARD = 1;

	public Receptor create(int tipoDoEmissor) {

		if (tipoDoEmissor == ReceptorCreator.VISA) {
			return new ReceptorVisa();
		} else if (tipoDoEmissor == ReceptorCreator.MASTERCARD) {

			return new ReceptorMastercard();
		}

		else {
			throw new IllegalArgumentException("Tipo de receptor não suportado");
		}
	}
}
