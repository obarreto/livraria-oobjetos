package br.com.ozystem.livraria.produto;

public class CarrinhoDeCompras {
		
	private double total;
	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);
		//livro.aplicaDescontoDe(0.16);
		total += produto.getValor();
	}

	public double getTotal() {
		return total;
	}
}
