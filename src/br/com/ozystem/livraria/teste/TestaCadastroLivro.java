package br.com.ozystem.livraria.teste;



import org.junit.jupiter.api.Test;

import br.com.ozystem.livraria.Autor;
import br.com.ozystem.livraria.produto.Ebook;
import br.com.ozystem.livraria.produto.Livro;
import br.com.ozystem.livraria.produto.LivroFisico;
import br.com.ozystem.livraria.produto.Promocional;

class TestaCadastroLivro {

	/*@Test
	void cadastroLivro() {
		
		
		
		Livro livro = new Livro(null);
		
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recurso da linguagem");
		livro.setValor(59.90);
		System.out.println("valor atual: "+ livro.getValor());
		livro.aplicaDescontoDe(0.1);
		livro.getIsbn();
		
		livro.mostrarDetalhes();
		
	}*/
	
	@Test
	void RegraDeDesconto(){
		Autor autor = new Autor();
		autor.setNome("Murilo Barreto");
		
		Livro livro = new LivroFisico(autor);
		livro.setValor(59.9);
		
		if(!((Promocional) livro).aplicaDescontoDe(0.3)) {
			System.out.println("Desconto no livro não pode ser maior do que 30%");
		}else {
			System.out.println("Valor do livro com desconto: " + livro.getValor());
		}
		
		Livro ebook = new Ebook(autor);
		ebook.setValor(29.9);
		ebook.setImpresso(true);
		
		if(!((Promocional) ebook).aplicaDescontoDe(0.15)) {
			System.out.println("Desconto de ebook não pode ser maior do que 15%");
		}else {
			System.out.println("Valor do ebook com desconto: " + ebook.getValor());
		}
		
	}

}
