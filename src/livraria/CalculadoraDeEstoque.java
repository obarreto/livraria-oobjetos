package livraria;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		
	/*double livroJava8 = 59.90;
	double livroTDD = 59.90;
	
	int numeroInteiro = (int) livroJava8;
	double soma = numeroInteiro + livroTDD;
	System.out.println(numeroInteiro);
	System.out.println(soma);
	*/
		double soma = 0;
		/*double contador = 0;
	while (contador < 35) {
		double valorDolivro = 59.90;
		soma += valorDolivro;
		contador ++;
	}*/
		
		for(double i = 0; i < 35; i++) {
			soma += 59.9;
		}
	    if(soma < 150) {
		    System.out.println("estoque baixo");
		    System.out.println(soma);
	    } else if (soma >= 2000){
	    	System.out.println("estoque alto");
	    	System.out.println(soma);
	    } else {
	    	System.out.println("estoque ok");
	    	System.out.println(soma);
	    }
	    
	    
	  double valor = soma < 100 ? 1 : 0;
	  System.out.println(valor);
	}
}
