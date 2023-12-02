package construtores;

// Método especial de uma classe chamado ao instanciar classes executando uma lógica
public class Construtor {
	// Deve ter o mesmo nome da classe, não possui retorno
	// Pode ser vazio ou receber parametros
	// Pode existir mais de um construtor
	
	private int numero;
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Construtor(int numero) {
		this.numero = numero;
	}
	
	public Construtor(String nome) {
		this.nome = nome;
	}
}
