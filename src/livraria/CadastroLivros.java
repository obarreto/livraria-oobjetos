package livraria;

public class CadastroLivros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autor autor = new Autor();
		autor.nome = "Ozéias Barreto";
		autor.email = "ozeias.sbarreto@uninove.edu.br";
		autor.cpf = "123.345.678-09";
		
		Livro livro = new LivroFisico(autor);
		
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recurso da linguagem");
		livro.setValor(59.90);
		
		if (((Promocional) livro).aplicaDescontoDe10PorCento()) {
			System.out.println("Valor agora é: " + livro.getValor());
		}
		

		System.out.println();
		livro.setIsbn("978-85-66250-46-6");
		
		livro.setAutor(autor);
		livro.mostrarDetalhes();
		
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("Janaína Cecília");
		outroAutor.setEmail("janinhalindademain@euquerovoce.com");
		outroAutor.setCpf("345.123.764-18");
		
		Livro outroLivro = new LivroFisico(outroAutor);
		
		outroLivro.setNome("Ser feliz é o que importa");
		outroLivro.setDescricao("Crie seus primeiros passos para felicidade");
		outroLivro.setValor(59.90); 
		outroLivro.setIsbn("978-85-66250-22-0");
		
		outroLivro.setAutor(outroAutor);
		outroLivro.mostrarDetalhes();
		
		Livro maisOutroLivro = new Ebook(null);
		
		maisOutroLivro.setNome("De Junior à Senior");
		maisOutroLivro.setDescricao("A jornada rumo a elite em dev");
		maisOutroLivro.setValor(259.90);
		maisOutroLivro.getIsbn();
		maisOutroLivro.mostrarDetalhes();
			
		CarrinhoDeCompras carrinhoDeCompra = new CarrinhoDeCompras();
		carrinhoDeCompra.adiciona(livro);
		carrinhoDeCompra.adiciona(outroLivro);
		carrinhoDeCompra.adiciona(maisOutroLivro);
		
		System.out.println("Total: " + carrinhoDeCompra.getTotal());
		
	}
}
