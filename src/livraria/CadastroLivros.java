package livraria;

public class CadastroLivros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autor autor = new Autor();
		autor.nome = "Ozéias Barreto";
		autor.email = "ozeias.sbarreto@uninove.edu.br";
		autor.cpf = "123.345.678-09";
		
		Livro livro = new Livro(autor);
		
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recurso da linguagem");
		livro.setValor(59.90);
		System.out.println("valor atual: "+ livro.getValor());
		livro.aplicaDescontoDe(0.2);
		
		
		
		//livro.valor -= livro.valor * 0.1;
		//System.out.println("Valor com desconto: "+ livro.aplicaDescontoDe(0.2));
		System.out.println();
		livro.setIsbn("978-85-66250-46-6");
		
		livro.setAutor(autor);
		livro.mostrarDetalhes();
		
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("Janaína Cecília");
		outroAutor.setEmail("janinhalindademain@euquerovoce.com");
		outroAutor.setCpf("345.123.764-18");
		
		Livro outroLivro = new Livro(outroAutor);
		
		outroLivro.setNome("Ser feliz é o que importa");
		outroLivro.setDescricao("Crie seus primeiros passos para felicidade");
		outroLivro.setValor(59.90); 
		outroLivro.setIsbn("978-85-66250-22-0");
		
		outroLivro.setAutor(outroAutor);
		outroLivro.mostrarDetalhes();
		
		//Autor maisOutroAutor = new Autor();
		Livro maisOutroLivro = new Livro();
		
		maisOutroLivro.setNome("De Junior à Senior");
		maisOutroLivro.setDescricao("A jornada rumo a elite em dev");
		maisOutroLivro.setValor(259.90);
		maisOutroLivro.getIsbn();//("349-84-79577-88-26");
		maisOutroLivro.mostrarDetalhes();
		
		if(autor == outroAutor){System.out.println("sim");}
		else {System.out.println("não");}
	}
}
