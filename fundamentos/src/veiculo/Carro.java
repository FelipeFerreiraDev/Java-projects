package veiculo;

// implements torna obrigatório a implementação dos métodos da interface pai
// No caso veiculo
public class Carro implements Veiculo {

	@Override
	public void acelerar() {
		System.out.println("Acelerou");
	}

	@Override
	public void frear() {
		System.out.println("Freou");
	}

}
