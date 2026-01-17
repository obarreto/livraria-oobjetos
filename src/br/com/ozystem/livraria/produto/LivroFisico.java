package br.com.ozystem.livraria.produto;

import br.com.ozystem.livraria.Autor;

public class LivroFisico extends Livro implements Promocional{
	
	public LivroFisico(Autor autor) {
		super(autor, true);
	}
	
	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		
		if (porcentagem > 0.3) {
			return false;
		} 
		
		System.out.println("Aplicando desconto em Livro Impresso");
		double desconto = this.getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}

}
