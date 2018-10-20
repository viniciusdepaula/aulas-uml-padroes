package br.edu.unitri;

public class TestePedidoFacade {

	public static void main(String[] args) {

		Estoque estoque = new Estoque();
		Financeiro financeiro = new Financeiro();
		PosVenda posVenda = new PosVenda();
		PedidoFacade facade = new PedidoFacade(estoque, financeiro, posVenda);
		Pedido pedido = new Pedido("Notebook", "José Silva", "Av. Nicomedes Alves dos Santos, 4545 - Gávea, Uberlândia - MG, 38411-106");
		facade.registraPedido(pedido);
	}
}
