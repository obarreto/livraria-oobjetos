package livraria;

public abstract class Livro implements Produto{
	
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	private boolean impresso = true;
	
	public Livro(Autor autor) {
		this(autor, true);
	}
	
		public Livro(Autor autor, boolean impresso) {
	    this.autor = autor;
	    this.impresso = impresso;
	    this.isbn = "000-00-00000-00-0";
	}

	public void mostrarDetalhes() {
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
		
		System.out.println("Tipo: " + (isImpresso() ? "Livro impresso" : "Ebook"));

		
		System.out.println("--");
		
	}

	
	
	public boolean temAutor() {
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
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
		}
	
	public boolean isImpresso() {
		
		return impresso;
	}

	public void setImpresso(boolean impresso) {
		this.impresso = impresso;
	}
}
