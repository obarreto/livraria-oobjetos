package livraria;



import org.junit.jupiter.api.Test;

class TestaCadastroLivro {

	@Test
	void cadastroLivro() {
		
		
		
		Livro livro = new Livro();
		
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recurso da linguagem");
		livro.setValor(59.90);
		System.out.println("valor atual: "+ livro.getValor());
		livro.aplicaDescontoDe(0.2);
		livro.getIsbn();
		livro.mostrarDetalhes();
	}

}
