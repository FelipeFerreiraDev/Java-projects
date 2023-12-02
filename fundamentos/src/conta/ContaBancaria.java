package conta;

//#F042
public class ContaBancaria {
	private String numero;
	private String titular;
	private double saldo;
	
	// Construtor --> método dentro da classe invocado automaticamente ao criar o objeto da classe
	public ContaBancaria() {
		this.saldo = 0.0;
	}
	
	// Getters e Setters tem acesso aos atributos private
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}


	// deposita
	void depositar(double valor) {
		if(valor>0) {
			saldo = saldo + valor;
			System.out.println("Deposito de :" + valor + " saldo total de :" + saldo);
		} else {
			System.out.println("Valor deve ser maior que 0");
		}
	}
	
	// sacar
	void sacar(double valor) {
		if (valor>0 && valor<=saldo) {
			saldo = saldo - valor;
			System.out.print("Saque de R$" + valor + ". Saldo atual R$ " + saldo);
		}
	}
}
