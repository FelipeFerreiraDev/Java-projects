package veiculo;

public class TesteDeVeiculo {
	public static void main(String[] args) {
		// Não é possível instanciar interfaces apenas objetos
		Carro carro = new Carro();
		Moto moto = new Moto();
		
		carro.acelerar();
		moto.acelerar();
		
		carro.frear();
		moto.frear();
	}
}
