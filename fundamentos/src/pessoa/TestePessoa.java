package pessoa;

public class TestePessoa {
	public static void main(String[] args) {
		Professor pessoa = new Professor();
		pessoa.setNome("Felipe");
		pessoa.setCpf("214.123.158-38");
		pessoa.setIdade(21);
		pessoa.setSalario(10000);
		
		System.out.println(pessoa.imprimeDados());
		
		Aluno pessoa2 = new Aluno();
		pessoa2.setNome("Ana");
		pessoa2.setCpf("200.187.178-01");
		pessoa2.setIdade(18);
		pessoa2.setMatricula("1232131");
		
		System.out.println(pessoa2.imprimeDados());
	}
}
