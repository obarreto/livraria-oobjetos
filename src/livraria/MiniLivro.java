package livraria;

public class MiniLivro extends Livro{
	
	public MiniLivro(Autor autor) {
		// TODO Auto-generated constructor stub
		super(autor);
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		return false;
	}
}
