package livraria;

public class Livro {
	
	String nome;
	String descricao;
	private double valor;
	String isbn;
	Autor autor;
	public Livro(Autor autor) {
		this();
		this.autor = autor;	
	}
	
	public Livro() {
		System.out.println("book created");
		this.isbn = "000-00-00000-00-0";
	}
	void mostrarDetalhes() {
		String mensagem = "Mostrando detalhes do livro";
		
		System.out.println(mensagem);
		System.out.println("livro: "+ nome);
		System.out.println("descricao: "+ descricao);
		System.out.println("preço: "+ valor);
		System.out.println("isbn: "+ isbn);
		System.out.println();
		
		if (this.temAutor()) {
			autor.mostrarDetalhesAutor();
			
			} else {
				System.out.println("Sem autor cadastrado!");
			}
		
		System.out.println("--");
		
	}
	
	boolean aplicaDescontoDe(double porcentagem) {
		
		if (porcentagem > 0.3) {
			return false;
		} 
		this.valor -= this.valor * porcentagem;
		return true;
	}
	
	boolean temAutor() {
		return this.autor != null;
		
	}
	
	
	//
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//
	public String getIsbn() {
		System.out.println("Aguardando ISBN");
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	//
	public Autor getAutor() {
		return autor;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	//
	double getValor() {
		return this.valor;
	}
	
	void setValor(double valor) {
		this.valor = valor;
		}
}
