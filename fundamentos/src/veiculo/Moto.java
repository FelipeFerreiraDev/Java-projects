package veiculo;

public class Moto implements Veiculo {
	@Override
	public void acelerar() {
		System.out.println("Acelerou");
	}

	@Override
	public void frear() {
		System.out.println("Freou");
	}
}
