package br.edu.unitri;

import java.util.Calendar;

/*
 * Aciona os método de um Builder para construir um produto.
 */

public class GeradorDeBoleto {

	private BoletoBuilder boletoBuilder;

	public GeradorDeBoleto(BoletoBuilder boletoBuilder) {
		this.boletoBuilder = boletoBuilder;
	}

	public Boleto geraBoleto() {

		this.boletoBuilder.buildSacado("José Silva");
		this.boletoBuilder.buildCedente("Banco do Brasil");
		this.boletoBuilder.buildValor(100.00);
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 3);
		this.boletoBuilder.buildVencimento(vencimento);
		this.boletoBuilder.buildNossoNumero(1234);
		Boleto boleto = boletoBuilder.getBoleto();
		return boleto;
	}
}