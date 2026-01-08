package livraria;

public class Autor {
	
	String nome;
	String email;
	String cpf;
	
	void mostrarDetalhesAutor() {
		
		System.out.println("autor: " + nome);
		System.out.println("email: " + email);
		System.out.println("cpf: " + cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
