package excessoes;

import pessoa.Pessoa;

public class Excessoes {
	public static void main(String[] args)  {
		// Checked exceptions
		// Compilador exige que você trate, possiveis de prever
		try {
			validar();
		} catch(Exception e) {
			System.out.println("Deu ruim");
			e.printStackTrace();
		}
		
		// Unchecked exceptions
		// Acontece no momento da execução
		Pessoa p = null;
		p.getCpf();
	}
	
	// throws Exception passa a responsabilidade pra camada superior
	public static void validar() throws Exception {
		int numero = 10;
		if (numero<100) {
			throw new Exception("O número é menor que 100");
		}
	}
}
