package br.edu.unitri;

public class TesteControleDePontoAdapter {

	public static void main(String[] args) throws InterruptedException {

		ControleDePonto controleDePonto = new ControleDePontoAdapter();
		Funcionario funcionario = new Funcionario("Marcelo Martins");
		controleDePonto.registraEntrada(funcionario);
		Thread.sleep(3);
		controleDePonto.registraSaida(funcionario);
	}
}