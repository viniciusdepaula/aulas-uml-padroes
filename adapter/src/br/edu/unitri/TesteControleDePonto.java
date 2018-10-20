package br.edu.unitri;

public class TesteControleDePonto {

	public static void main(String[] args) throws InterruptedException {
		
		ControleDePonto controleDePonto = new ControleDePonto();
		Funcionario funcionario = new Funcionario("Marcelo Martins");
		controleDePonto.registraEntrada(funcionario);
		Thread.sleep(3);
		controleDePonto.registraSaida(funcionario);
	}
}
