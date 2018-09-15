package br.edu.unitri;

import java.util.Calendar;

/*
 * Define os objetos que devem ser construídos pelos Builders.
 */

public interface Boleto {

	String getSacado();

	String getCedente();

	double getValor();

	Calendar getVencimento();

	int getNossoNumero();

	String toString();

}