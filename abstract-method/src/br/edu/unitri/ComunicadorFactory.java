package br.edu.unitri;

public interface ComunicadorFactory {

	Emissor createEmissor(); 
	Receptor createReceptor();
}
