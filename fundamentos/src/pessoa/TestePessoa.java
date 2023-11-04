package pessoa;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Felipe";
		pessoa.cpf = "214.123.158-38";
		pessoa.idade = 21;
		
		System.out.println(pessoa.imprimeDados());
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Ana";
		pessoa2.cpf = "200.187.178-01";
		pessoa2.idade = 18;
		
		System.out.println(pessoa.nome);
		System.out.println(pessoa2.nome);
	}
}
